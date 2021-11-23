public double calculateAverage(float[] elements) {
    double result = elements[0];
    for (int index = 1; index < (elements.length); index++) {
        result = result + (elements[index]);
    }
    double average = result / (elements.length);
    return average;
}