public boolean isNumeric(java.lang.String s) {
    try {
        int n = java.lang.Integer.parseInt(s);
        return true;
    } catch (java.lang.NumberFormatException e) {
        return false;
    }
}