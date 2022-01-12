public double calculatePlagiarismRatio(java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> synonymsMap, java.util.List<main.java.NTuple> nTuples1, java.util.List<main.java.NTuple> nTuples2) {
    double count = 0;
    for (main.java.NTuple nTuple1 : nTuples1) {
        for (main.java.NTuple nTuple2 : nTuples2) {
            if (nTuple1.isMatch(nTuple2, synonymsMap))
                count++;
            
        }
    }
    return count / (nTuples1.size());
}