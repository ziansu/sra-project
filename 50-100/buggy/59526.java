public java.util.Map<java.lang.String, java.lang.Double> generateProbabilityDistributionMap(java.util.Map<java.lang.String, java.lang.Integer> wordMap, int total) {
    java.util.Map<java.lang.String, java.lang.Double> probabilityDistributionMap = new java.util.HashMap<java.lang.String, java.lang.Double>();
    for (java.lang.String word : wordMap.keySet()) {
        probabilityDistributionMap.put(word, ((wordMap.get(word)) / (total * 0.1)));
    }
    return probabilityDistributionMap;
}