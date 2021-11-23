public static void deleteAllGenesetRecords() throws org.mskcc.cbio.portal.dao.DaoException {
    java.sql.Connection con = null;
    java.sql.PreparedStatement pstmt = null;
    java.sql.ResultSet rs = null;
    try {
        con = org.mskcc.cbio.portal.dao.JdbcUtil.getDbConnection(org.mskcc.cbio.portal.dao.DaoGeneset.class);
        pstmt = con.prepareStatement("DELETE FROM geneset");
        pstmt.executeUpdate();
    } catch (java.sql.SQLException e) {
        throw new org.mskcc.cbio.portal.dao.DaoException(e);
    } finally {
        org.mskcc.cbio.portal.dao.JdbcUtil.closeAll(org.mskcc.cbio.portal.dao.DaoGeneset.class, con, pstmt, rs);
    }
}