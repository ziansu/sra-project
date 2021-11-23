private java.lang.String getDeleteById(java.lang.String firstTab, java.lang.Class queryClass, java.lang.String tablename) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.lang.String secondTab = (TAB_1) + firstTab;
    sb.append(firstTab).append("<delete id=\"deleteById\" parameterType=\"long\">").append(BREAK_ROW);
    sb.append(secondTab).append("delete from  ").append(tablename).append(" where id = #{id}").append(BREAK_ROW);
    sb.append(firstTab).append("</delete>").append(BREAK_ROW);
    return sb.toString();
}