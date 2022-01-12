private boolean isTrained() {
    try {
        java.lang.String test = ann.toString();
        return true;
    } catch (java.lang.NullPointerException ex) {
        return false;
    }
}