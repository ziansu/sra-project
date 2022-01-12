public static java.lang.String getProcedureName(com.hangum.tadpole.engine.query.dao.mysql.ProcedureFunctionDAO tc) {
    if (("".equals(tc.getSchema_name())) || (null == (tc.getSchema_name())))
        return tc.getName();
    else
        return java.lang.String.format("%s.%s", tc.getSchema_name(), tc.getName());
    
}