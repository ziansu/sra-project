public static final java.lang.String newTableName(java.lang.String tableName) {
    java.lang.String[] strS = tableName.split("_");
    java.lang.StringBuilder sb = new java.lang.StringBuilder("");
    for (java.lang.String st : strS) {
        sb.append(com.fzrj.architect.labor.utils.StringUtil.upperFirst(st));
    }
    return sb.toString();
}