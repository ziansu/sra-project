@java.lang.Override
public long GetUserID(java.lang.String email) {
    java.util.ArrayList<java.lang.Object[]> r = ExecuteStoredProcedureRead(connection, "getUserID", new java.lang.Object[]{ email });
    if ((r.size()) == 0)
        return -1;
    
    java.lang.Object[] o = r.get(0);
    return ((int) (o[0]));
}