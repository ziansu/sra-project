public java.lang.String queryString(java.lang.String addressQuery) {
    java.lang.String delimeter = "\\?";
    java.lang.String[] temp = addressQuery.split(delimeter);
    return temp[1];
}