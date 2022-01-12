private java.lang.String formatScore(double d, boolean addPlus) {
    java.lang.String s = java.lang.Integer.toString(((int) (d)));
    if (addPlus && (((int) (d)) >= 0))
        s = "+" + s;
    
    return s;
}