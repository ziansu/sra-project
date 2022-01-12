protected com.wso2telco.services.dep.sandbox.util.RequestError constructRequestError(int type, java.lang.String messageId, java.lang.String text, java.lang.String variable) {
    com.wso2telco.services.dep.sandbox.util.RequestError error = new com.wso2telco.services.dep.sandbox.util.RequestError();
    if (type == (com.wso2telco.services.dep.sandbox.servicefactory.AbstractRequestHandler.SERVICEEXCEPTION)) {
        com.wso2telco.dep.oneapivalidation.exceptions.ServiceException serviceException = new com.wso2telco.dep.oneapivalidation.exceptions.ServiceException(messageId, text, variable);
        error.setServiceException(serviceException);
    }else
        if (type == (com.wso2telco.services.dep.sandbox.servicefactory.AbstractRequestHandler.POLICYEXCEPTION)) {
            com.wso2telco.dep.oneapivalidation.exceptions.PolicyException policyException = new com.wso2telco.dep.oneapivalidation.exceptions.PolicyException(messageId, text, variable);
            error.setPolicyException(policyException);
        }
    
    return error;
}