private static double calculateJaccardCoefficient(java.util.Collection<java.lang.Integer> set1, java.util.Collection<java.lang.Integer> set2, java.util.Collection<java.lang.Integer> commonSet) {
    double cs = commonSet.size();
    double shortest;
    if ((set1.size()) > (set2.size())) {
        shortest = set2.size();
    }else {
        shortest = set1.size();
    }
    double different = shortest - cs;
    return cs / different;
}