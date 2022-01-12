public java.lang.String queryString(java.lang.String addressQuery) {
    java.lang.String delimeter = "\\?";
    java.lang.String[] temp = addressQuery.split(delimeter);
    if ((temp.length) > 1) {
        return temp[1];
    }else {
        return null;
    }
}