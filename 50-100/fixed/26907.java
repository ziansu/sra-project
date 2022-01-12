protected java.lang.String setPageLimits(java.lang.String query) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(query);
    sb.append(((("  LIMIT " + (((pageNo) - 1) * (pageSize))) + ",") + (pageSize)));
    return sb.toString();
}