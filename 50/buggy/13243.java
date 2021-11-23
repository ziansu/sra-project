private double mean(java.util.ArrayList<java.lang.Double> array) {
    double sum = 0;
    int length = array.size();
    for (double i : array) {
        sum += i;
    }
    return sum / length;
}