public boolean areDoublesInListEqual(java.util.List<java.lang.Double> l) {
    boolean areDoublesEqual = true;
    for (java.lang.Double d : l) {
        for (java.lang.Double d2 : l) {
            if (!(d.equals(d2))) {
                areDoublesEqual = false;
            }
        }
    }
    return areDoublesEqual;
}