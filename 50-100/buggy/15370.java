public java.util.Map<java.lang.String, java.lang.Double> computeWeights() {
    java.util.List<java.lang.String> vocabularies = categoryDataset.getListOfWords();
    for (java.lang.String word : vocabularies) {
        weights.put(word, computeTFIDF(word));
        java.lang.System.out.println(((word + ":") + (weights.get(word))));
    }
    return weights;
}