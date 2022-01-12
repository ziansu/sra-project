public static void publishInvalidRequest(javax.servlet.http.HttpServletRequest request) {
    com.wso2telco.ids.datapublisher.model.UserStatus uStatus = com.wso2telco.ids.datapublisher.util.DataPublisherUtil.buildUserStatusFromRequest(request);
    uStatus.setStatus(com.wso2telco.ids.datapublisher.util.DataPublisherUtil.UserState.INVALID_REQUEST.name());
    uStatus.setComment("Invalid Request");
    com.wso2telco.ids.datapublisher.util.DataPublisherUtil.publishUserStatusMetaData(uStatus);
    com.wso2telco.ids.datapublisher.util.DataPublisherUtil.publishUserStatusData(uStatus);
}