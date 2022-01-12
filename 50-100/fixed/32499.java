static double averageScore(java.util.ArrayList<java.lang.Integer> scores) {
    double sum = 0;
    for (int i = 0; i < (scores.size()); i++) {
        sum += scores.get(i);
    }
    return sum / (scores.size());
}