@java.lang.Override
public long GetUserID(java.lang.String email) {
    java.util.ArrayList<java.lang.Object[]> r = ExecuteStoredProcedureRead(connection, "getUserID", new java.lang.Object[]{ email });
    java.lang.Object[] o = r.get(0);
    return ((int) (o[0]));
}