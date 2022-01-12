public java.util.List<Pair> remainingPair(java.util.List<java.lang.String> remainingCandidates) {
    java.util.List<Pair> remainingPairs = new java.util.ArrayList<Pair>();
    for (java.lang.String s : valuesPersonMap.keySet()) {
        for (java.lang.String v : valuesPersonMap.get(s)) {
            if (remainingCandidates.contains(v)) {
                remainingPairs.add(new Pair(attributeName, s));
                break;
            }
        }
    }
    return remainingPairs;
}