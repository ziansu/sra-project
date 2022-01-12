public double getMutationSpeedOverLast10Generations() {
    java.util.Collection<org.nusco.narjillos.genomics.DNA> dnas = dnaById.values();
    if (dnas.isEmpty())
        return 0;
    
    double result = 0;
    for (long dnaId : currentPool) {
        org.nusco.narjillos.genomics.DNA dna = dnaById.get(dnaId);
        org.nusco.narjillos.genomics.DNA tenthGenerationAncestor = getAncestor(dna, 10);
        result += dna.getLevenshteinDistanceFrom(tenthGenerationAncestor);
    }
    return result / (currentPool.size());
}