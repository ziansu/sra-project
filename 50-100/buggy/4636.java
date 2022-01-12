@java.lang.Override
public java.util.List<org.wso2.carbon.policy.mgt.common.ProfileFeature> getFeaturesForProfile(int profileId) throws org.wso2.carbon.policy.mgt.common.FeatureManagementException {
    try {
        org.wso2.carbon.device.mgt.core.dao.DeviceManagementDAOFactory.openConnection();
        return featureDAO.getFeaturesForProfile(profileId);
    } catch (org.wso2.carbon.policy.mgt.core.dao.FeatureManagerDAOException e) {
        throw new org.wso2.carbon.policy.mgt.common.FeatureManagementException("Error occurred while getting the features", e);
    } catch (java.sql.SQLException e) {
        throw new org.wso2.carbon.policy.mgt.common.FeatureManagementException("Error occurred while opening a connection to the data source", e);
    } finally {
        org.wso2.carbon.policy.mgt.core.dao.PolicyManagementDAOFactory.closeConnection();
    }
}