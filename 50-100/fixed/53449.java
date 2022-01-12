public java.lang.String getQuery() {
    if ((query) == (-1)) {
        return "";
    }else {
        int queryEnd = ((fragment) == (-1)) ? raw.length() : (fragment) - 1;
        return raw.substring(query, queryEnd);
    }
}