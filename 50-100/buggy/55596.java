static double average(java.util.Collection<java.lang.Double> numbers) {
    if ((numbers.size()) == 0) {
        throw new java.lang.IllegalArgumentException("Must get at least one number to compute average");
    }
    double sum = 0.0;
    for (double number : numbers) {
        sum += number;
    }
    return sum / (numbers.size());
}