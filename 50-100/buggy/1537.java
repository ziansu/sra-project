public static java.lang.Integer getIntValue(java.lang.String typeName) {
    java.lang.Integer ret = ((java.lang.Integer) (ftldb.SQLTypeHelper.encoder.get(typeName)));
    if (ret == null) {
        ret = ftldb.SQLTypeHelper.extractConstant(typeName);
        if (ret != null) {
            ftldb.SQLTypeHelper.encoder.put(typeName, ret);
        }
    }
    return ret;
}