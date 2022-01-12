private boolean sameRgba(double[] rgba1, double[] rgba2) {
    for (int j = 0; j < 4; j++) {
        if ((java.lang.Math.abs(((rgba1[j]) - (rgba2[j])))) > 1.0E-5) {
            return false;
        }
    }
    return true;
}