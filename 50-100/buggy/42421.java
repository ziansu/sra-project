private int parseDouble(java.lang.Object obj) {
    if (obj instanceof java.lang.Integer) {
        return ((java.lang.Integer) (obj));
    }
    if (obj instanceof java.lang.String) {
        return java.lang.Integer.parseInt(((java.lang.String) (obj)));
    }
    throw new java.lang.NumberFormatException();
}