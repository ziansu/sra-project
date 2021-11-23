public static double TF(int termCount, double avg, int D) {
    return ((termCount * ((resources.TFIDF.k1) + 1)) / (termCount + ((resources.TFIDF.k1) * ((1 - (resources.TFIDF.b)) + (((resources.TFIDF.b) * D) / avg))))) + 1.0;
}