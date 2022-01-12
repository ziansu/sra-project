public void generateGenomes() {
    genomes = new java.util.HashMap<java.lang.String, genome.Genome>();
    for (genome.Strand strand : strandNodes.values()) {
        for (java.lang.String genomeID : strand.getGenomes()) {
            if (!(genomes.containsKey(genomeID))) {
                genome.Genome genome = new genome.Genome(genomeID);
                genome = new genome.Genome(genomeID);
                genomes.put(genomeID, genome);
            }else {
                genomes.get(genomeID).addStrand(strand);
            }
        }
    }
}