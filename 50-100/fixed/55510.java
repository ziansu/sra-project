protected static boolean appendIfNotEmpty(java.lang.StringBuilder builder, java.lang.String colName, java.lang.String value, java.util.List<java.lang.Object> params, boolean needWhere) {
    if (value != null) {
        needWhere = io.jpress.model.query.JBaseQuery.appendWhereOrAnd(builder, needWhere);
        builder.append(" ").append(colName).append(" = ? ");
        params.add(value);
    }
    return needWhere;
}