static double averageScore(java.util.ArrayList<java.lang.Integer> scores) {
    double sum = 0;
    int n = (scores.size()) - 1;
    for (int i = 0; i < n; i++) {
        sum += scores.get(i);
    }
    return sum / n;
}