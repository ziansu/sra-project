public static void deleteNode(java.sql.Connection con, com.stratelia.silverpeas.treeManager.model.TreeNodePK treeNodePK, java.lang.String treeId) throws java.sql.SQLException {
    java.lang.String deleteQuery = "DELETE FROM SB_Tree_Tree WHERE treeId= ? AND id = ?";
    java.sql.PreparedStatement stmt = null;
    try {
        stmt = con.prepareStatement(deleteQuery);
        stmt.setInt(1, java.lang.Integer.parseInt(treeId));
        stmt.setInt(2, java.lang.Integer.parseInt(treeNodePK.getId()));
        stmt.executeUpdate(deleteQuery);
    } finally {
        com.stratelia.webactiv.util.DBUtil.close(stmt);
    }
}