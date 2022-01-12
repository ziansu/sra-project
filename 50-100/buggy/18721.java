public java.lang.String getLimitString(java.lang.String querySelect, int offset, int limit) {
    return new java.lang.StringBuffer(((querySelect.length()) + 22)).append(querySelect).append((((("{maxrows " + limit) + ",") + (offset + 1)) + "}")).toString();
}