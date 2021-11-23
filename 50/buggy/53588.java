@java.lang.Override
public java.util.Collection selectLEContactOnWhereClause(java.lang.String whereClause) throws java.rmi.RemoteException {
    return dbSQL.LeContactsSql.selectLEContactOnWhereClause(whereClause, dsSQL.getConn());
}