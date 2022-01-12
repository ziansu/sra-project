@java.lang.Override
public boolean removeFeature(java.lang.String code) throws org.wso2.carbon.device.mgt.common.DeviceManagementException {
    boolean status;
    try {
        org.wso2.carbon.device.mgt.mobile.impl.windows.dao.WindowsDAOFactory.beginTransaction();
        featureDAO.deleteFeatureByCode(code);
        org.wso2.carbon.device.mgt.mobile.impl.windows.dao.WindowsDAOFactory.commitTransaction();
        status = true;
        return status;
    } catch (org.wso2.carbon.device.mgt.mobile.dao.MobileDeviceManagementDAOException e) {
        org.wso2.carbon.device.mgt.mobile.impl.windows.dao.WindowsDAOFactory.rollbackTransaction();
        throw new org.wso2.carbon.device.mgt.common.DeviceManagementException("Error occurred while removing the feature", e);
    } finally {
        org.wso2.carbon.device.mgt.mobile.impl.windows.dao.WindowsDAOFactory.closeConnection();
    }
}