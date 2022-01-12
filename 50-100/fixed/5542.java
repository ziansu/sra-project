@java.lang.Override
public int getPolicyCount() throws org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagementException {
    try {
        org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagementDAOFactory.openConnection();
        return policyDAO.getPolicyCount();
    } catch (org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagerDAOException e) {
        throw new org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagementException("Error occurred while getting policy count", e);
    } catch (java.sql.SQLException e) {
        throw new org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagementException("Error occurred while opening a connection to the data source", e);
    } finally {
        org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagementDAOFactory.closeConnection();
    }
}