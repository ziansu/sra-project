protected void basicSetSlope(double m, boolean changeText) {
    sloped = m;
    if (changeText) {
        if (java.lang.Double.isNaN(m)) {
            slope.setText("");
        }else {
            slope.setText(format(sloped));
        }
    }
}