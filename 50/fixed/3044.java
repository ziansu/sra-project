public static java.lang.Integer getInt(java.lang.String sql) {
    java.lang.String s = java.lang.String.valueOf(ids.sardine.TransferUtil.getObject(sql));
    return _String_.isNumber(s) ? java.lang.Integer.parseInt(s) : null;
}