public org.nusco.narjillos.genomics.DNA mutate(long id, org.nusco.narjillos.core.utilities.RanGen ranGen) {
    java.util.List<java.lang.Integer[]> resultChromosomes = new java.util.LinkedList<>();
    for (org.nusco.narjillos.genomics.Chromosome chromosome : this)
        if (isChromosomeMutation(ranGen))
            resultChromosomes.addAll(mutateChromosome(ranGen, chromosome));
        else
            resultChromosomes.add(copyChromosome(chromosome, ranGen));
        
    
    java.lang.Integer[] resultGenes = flattenToGenes(resultChromosomes);
    return new org.nusco.narjillos.genomics.DNA(id, padToSameGenomeLength(resultGenes));
}