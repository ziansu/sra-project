@java.lang.Override
public int getPolicyCount() throws org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagementException {
    int policyCount;
    try {
        org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagementDAOFactory.openConnection();
        policyCount = policyDAO.getPolicyCount();
        return policyCount;
    } catch (org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagerDAOException e) {
        throw new org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagementException("Error occurred while getting policy count", e);
    } catch (java.sql.SQLException e) {
        throw new org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagementException("Error occurred while opening a connection to the data source", e);
    } finally {
        org.wso2.carbon.policy.mgt.core.mgt.impl.PolicyManagementDAOFactory.closeConnection();
    }
}