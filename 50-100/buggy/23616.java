public java.util.ArrayList<java.util.ArrayList<java.lang.String>> executeUserStatement(java.lang.String statement) throws de.tu_bs.cs.ifis.sqlgame.exception.MySQLAlchemistException {
    if ((this.tmpDbConn) == null) {
        java.lang.System.out.println("jafiuhiebn");
    }
    java.util.ArrayList<java.util.ArrayList<java.lang.String>> result = this.tmpDbConn.executeSQLSelectStatement(this.conf.getString("auth.user"), this.conf.getString("auth.pass"), statement);
    return result;
}