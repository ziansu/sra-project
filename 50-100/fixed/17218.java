public static java.lang.String getConstraintName(com.hangum.tadpole.engine.query.dao.mysql.TableConstraintsDAO tc) {
    if (("".equals(tc.getSchema_name())) || (null == (tc.getSchema_name())))
        return tc.getTABLE_NAME();
    else
        return java.lang.String.format("%s.%s", tc.getSchema_name(), tc.getTABLE_NAME());
    
}