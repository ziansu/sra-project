public static org.wso2.carbon.core.commons.stub.loggeduserinfo.LoggedUserInfo getLoggedInUserInfo(java.lang.String cookie, java.lang.String serviceUrl) throws java.rmi.RemoteException, org.wso2.carbon.core.commons.stub.loggeduserinfo.ExceptionException {
    org.wso2.carbon.core.commons.stub.loggeduserinfo.LoggedUserInfoAdminStub stub = new org.wso2.carbon.core.commons.stub.loggeduserinfo.LoggedUserInfoAdminStub(null, (serviceUrl + "LoggedUserInfoAdmin"));
    org.apache.axis2.client.ServiceClient client = stub._getServiceClient();
    org.apache.axis2.client.Options options = client.getOptions();
    options.setManageSession(true);
    options.setProperty(HTTPConstants.COOKIE_STRING, cookie);
    org.wso2.carbon.core.commons.stub.loggeduserinfo.LoggedUserInfo userInfo = stub.getUserInfo();
    return userInfo;
}