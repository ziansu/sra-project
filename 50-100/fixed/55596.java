@org.jetbrains.annotations.Nullable
static java.lang.Double average(java.util.Collection<java.lang.Double> numbers) {
    if ((numbers.size()) == 0) {
        return null;
    }
    double sum = 0.0;
    for (double number : numbers) {
        sum += number;
    }
    return sum / (numbers.size());
}