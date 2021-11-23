@java.lang.Override
public java.util.List<org.wso2.carbon.apimgt.core.models.Tag> getAllTags() throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    java.util.List<org.wso2.carbon.apimgt.core.models.Tag> tagList;
    try {
        tagList = getTagDAO().getTags();
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while retrieving tags";
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg, e);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
    return tagList;
}