public void setPrivilege(java.lang.String token, java.lang.String user, int priv) {
    com.EIMA.Database.DBQueries.modifyPrivlege(token, user, ("" + priv));
}