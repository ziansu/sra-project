public long calculeNumberOfIssues() {
    java.lang.StringBuilder sql = new java.lang.StringBuilder();
    sql.append(COUNT_ISSUES);
    sql.append(FIXED_ISSUES_ONLY);
    java.lang.Long count = ((java.lang.Long) (dao.selectNativeOneWithParams(sql.toString(), new java.lang.Object[0])));
    return count != null ? count : 0L;
}