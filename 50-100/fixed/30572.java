public void add(double value) {
    if (((min) == null) || (value < (min))) {
        min = value;
    }
    if (((max) == null) || (value > (max))) {
        max = value;
    }
}