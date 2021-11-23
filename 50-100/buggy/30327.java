public long calculeNumberOfIssues() {
    java.util.List<java.lang.Object> selectParams = new java.util.ArrayList<>();
    java.lang.StringBuilder sql = new java.lang.StringBuilder();
    sql.append(COUNT_ISSUES);
    sql.append(FIXED_ISSUES_ONLY);
    java.lang.Long count = ((java.lang.Long) (dao.selectNativeOneWithParams(sql.toString(), selectParams.toArray())));
    return count != null ? count : 0L;
}