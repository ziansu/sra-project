public void setFetchDirection(int direction) throws java.sql.SQLException {
    checkOpen();
    switch (direction) {
        case java.sql.ResultSet.FETCH_UNKNOWN :
        case java.sql.ResultSet.FETCH_REVERSE :
            if ((resultSetType) == (java.sql.ResultSet.TYPE_FORWARD_ONLY)) {
                throw new java.sql.SQLException(net.sourceforge.jtds.jdbc.Messages.get("error.resultset.fwdonly"), "24000");
            }
        case java.sql.ResultSet.FETCH_FORWARD :
            fetchDirection = direction;
            break;
        default :
            throw new java.sql.SQLException(net.sourceforge.jtds.jdbc.Messages.get("error.generic.badoption", java.lang.Integer.toString(direction), "direction"), "24000");
    }
}