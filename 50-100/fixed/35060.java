public org.wso2.carbon.tools.wsdlvalidator.Report validateFromFile(java.lang.String type, javax.activation.DataHandler filedata) throws java.lang.Exception {
    java.io.InputStream inputStream;
    try {
        inputStream = filedata.getDataSource().getInputStream();
    } catch (java.io.IOException e) {
        throw new org.wso2.carbon.tools.wsdlvalidator.exception.WSDLValidatorException("Exception occurred when validating XML document", e);
    }
    org.wso2.carbon.tools.wsdlvalidator.WSDLValidationInfo info = validaWSDLFromURI(inputStream);
    return dataPacker(info);
}