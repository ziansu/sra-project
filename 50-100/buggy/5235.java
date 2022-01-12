@java.lang.Override
public com.stacksync.commons.models.SharingProposal findByKey(java.util.UUID key) throws com.stacksync.syncservice.exceptions.dao.DAOException {
    java.sql.ResultSet resultSet = null;
    com.stacksync.commons.models.SharingProposal sharingProposal = null;
    java.lang.String query = "SELECT * FROM cloudspaces_sharing_proposal WHERE key = ?";
    try {
        resultSet = executeQuery(query, new java.lang.Object[]{ key });
        if (resultSet.next()) {
            sharingProposal = com.stacksync.syncservice.db.DAOUtil.getSharingProposalFromResultSet(resultSet);
        }
    } catch (java.sql.SQLException e) {
        com.stacksync.syncservice.db.postgresql.PostgresqlSharingProposalDAO.logger.error(e);
        throw new com.stacksync.syncservice.exceptions.dao.DAOException(com.stacksync.syncservice.db.DAOError.INTERNAL_SERVER_ERROR);
    }
    return sharingProposal;
}