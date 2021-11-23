public static void rollbackTransaction() throws org.wso2.carbon.device.mgt.mobile.impl.android.dao.MobileDeviceManagementDAOException {
    try {
        java.sql.Connection conn = org.wso2.carbon.device.mgt.mobile.impl.android.dao.AndroidDAOFactory.currentConnection.get();
        if (conn != null) {
            conn.rollback();
        }else {
            if (org.wso2.carbon.device.mgt.mobile.impl.android.dao.AndroidDAOFactory.log.isDebugEnabled()) {
                org.wso2.carbon.device.mgt.mobile.impl.android.dao.AndroidDAOFactory.log.debug(("Datasource connection associated with the current thread is null, hence rollback " + "has not been attempted"));
            }
        }
    } catch (java.sql.SQLException e) {
        throw new org.wso2.carbon.device.mgt.mobile.impl.android.dao.MobileDeviceManagementDAOException("Error occurred while rollback the transaction", e);
    } finally {
        org.wso2.carbon.device.mgt.mobile.impl.android.dao.AndroidDAOFactory.closeConnection();
    }
}