private static int calculateAverage(java.util.ArrayList<java.lang.Integer> numbers) {
    int sum = 0;
    for (int i = 0; i < (numbers.size()); i++) {
        sum = sum + (numbers.get(i));
    }
    int average = sum / (numbers.size());
    return average;
}