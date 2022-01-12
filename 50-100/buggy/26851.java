public static gene.Gene parseGene(java.lang.String line) {
    java.lang.String[] tokens = line.split(",");
    int chr = java.lang.Integer.parseInt(tokens[3]);
    long s = java.lang.Long.parseLong(tokens[1]);
    long e = java.lang.Long.parseLong(tokens[2]);
    genome.GenomicCoordinate start = new genome.GenomicCoordinate(chr, s);
    genome.GenomicCoordinate end = new genome.GenomicCoordinate(chr, e);
    java.lang.String id = tokens[0];
    return new gene.Gene(id, start, end);
}