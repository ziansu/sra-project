public static java.util.List<java.lang.String> getListOfAuthorizedDomainsByConsumerKey(java.lang.String consumerKey) throws org.wso2.carbon.apimgt.api.APIManagementException {
    java.lang.String list = org.wso2.carbon.apimgt.impl.dao.ApiMgtDAO.getAuthorizedDomainsByConsumerKey(consumerKey);
    if ((list != null) || (!(list.isEmpty()))) {
        return java.util.Arrays.asList(list.split(","));
    }
    return null;
}