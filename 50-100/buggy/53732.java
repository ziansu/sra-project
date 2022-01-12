public double argmax() {
    double max = java.lang.Double.NEGATIVE_INFINITY;
    int argmax = 0;
    for (int i = 0; i < (this.length()); i++) {
        double e = this.get(i);
        if (e > max) {
            argmax = i;
        }
    }
    return argmax;
}