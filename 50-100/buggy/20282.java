private int classify(double dataConversion, double minValue, double maxValue) {
    int count = 0;
    int classes = 4;
    double currentValue = minValue;
    double change = (maxValue - minValue) / classes;
    while ((currentValue <= dataConversion) && (currentValue != maxValue)) {
        currentValue += change;
        ++count;
    } 
    return count;
}