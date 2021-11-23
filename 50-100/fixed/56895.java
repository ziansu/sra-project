private java.sql.Connection openTransaction() throws com.stratelia.silverpeas.pdc.control.PdcException {
    java.sql.Connection con;
    try {
        con = org.silverpeas.util.DBUtil.openConnection();
        con.setAutoCommit(false);
    } catch (java.lang.Exception e) {
        throw new com.stratelia.silverpeas.pdc.control.PdcException("PdcBmImpl.openTransaction()", org.silverpeas.util.exception.SilverpeasException.ERROR, "root.EX_CONNECTION_OPEN_FAILED", e);
    }
    return con;
}