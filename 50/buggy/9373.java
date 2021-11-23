private java.sql.Connection openConnection() throws com.stratelia.silverpeas.pdc.control.PdcException {
    java.sql.Connection con = null;
    try {
        con = org.silverpeas.util.DBUtil.openConnection();
    } catch (java.lang.Exception e) {
        throw new com.stratelia.silverpeas.pdc.control.PdcException("PdcBmImpl.openConnection()", org.silverpeas.util.exception.SilverpeasException.ERROR, "root.EX_CONNECTION_OPEN_FAILED", e);
    }
    return con;
}