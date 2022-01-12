public static void commitTransaction() throws org.wso2.carbon.device.mgt.common.TransactionManagementException {
    try {
        java.sql.Connection conn = org.wso2.carbon.device.mgt.core.dao.DeviceManagementDAOFactory.currentConnection.get();
        if (conn != null) {
            conn.commit();
        }else {
            if (org.wso2.carbon.device.mgt.core.dao.DeviceManagementDAOFactory.log.isDebugEnabled()) {
                org.wso2.carbon.device.mgt.core.dao.DeviceManagementDAOFactory.log.debug(("Datasource connection associated with the current thread is null, hence commit " + "has not been attempted"));
            }
        }
    } catch (java.sql.SQLException e) {
        throw new org.wso2.carbon.device.mgt.common.TransactionManagementException("Error occurred while committing the transaction", e);
    }
}