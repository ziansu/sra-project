protected static boolean appendIfNotEmpty(java.lang.StringBuilder builder, java.lang.String colName, java.math.BigInteger value, java.util.List<java.lang.Object> params, boolean needWhere) {
    if ((value != null) && ((value.compareTo(java.math.BigInteger.ZERO)) > 0)) {
        needWhere = io.jpress.model.query.JBaseQuery.appendWhereOrAnd(builder, needWhere);
        builder.append(" ").append(colName).append(" = ? ");
        params.add(value);
    }
    return needWhere;
}