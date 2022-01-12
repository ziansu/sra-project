public double getMutationSpeedOverLast10Generations() {
    if (currentPool.isEmpty())
        return 0;
    
    double result = 0;
    for (long dnaId : currentPool) {
        org.nusco.narjillos.genomics.DNA dna = dnaById.get(dnaId);
        org.nusco.narjillos.genomics.DNA tenthGenerationAncestor = getAncestor(dna, 10);
        result += dna.getLevenshteinDistanceFrom(tenthGenerationAncestor);
    }
    return result / (currentPool.size());
}