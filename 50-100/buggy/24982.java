private void readGenes(java.lang.String geneFile) throws java.io.IOException {
    geneList = japsa.seq.SequenceReader.readAll(geneFile, japsa.seq.Alphabet.DNA());
    geneMap = new java.util.HashMap<java.lang.String, japsa.seq.Sequence>();
    for (japsa.seq.Sequence gene : geneList) {
        geneMap.put(gene.getName(), gene);
    }
}