public void recordAPILifeCycleEvent(org.wso2.carbon.apimgt.api.model.APIIdentifier identifier, org.wso2.carbon.apimgt.api.model.APIStatus oldStatus, org.wso2.carbon.apimgt.api.model.APIStatus newStatus, java.lang.String userId) throws org.wso2.carbon.apimgt.api.APIManagementException {
    java.sql.Connection conn = null;
    try {
        conn = org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil.getConnection();
        recordAPILifeCycleEvent(identifier, oldStatus, newStatus, userId, conn);
    } catch (java.sql.SQLException e) {
        org.wso2.carbon.apimgt.impl.dao.ApiMgtDAO.handleException("Failed to record API state change", e);
    } finally {
        org.wso2.carbon.apimgt.impl.utils.APIMgtDBUtil.closeAllConnections(null, conn, null);
    }
}