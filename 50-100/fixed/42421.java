private double parseDouble(java.lang.Object obj) {
    if (obj instanceof java.lang.Double) {
        return ((java.lang.Double) (obj));
    }
    if (obj instanceof java.lang.String) {
        return java.lang.Double.parseDouble(((java.lang.String) (obj)));
    }
    throw new java.lang.NumberFormatException();
}