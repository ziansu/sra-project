private int getIntParameter(java.lang.String queryParam, int defValue) {
    if (queryParam != null) {
        try {
            return java.lang.Integer.parseInt(queryParam);
        } catch (java.lang.NumberFormatException ex) {
        }
    }
    return defValue;
}