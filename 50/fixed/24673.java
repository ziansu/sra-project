public org.wso2.carbon.tools.wsdlvalidator.Report validateFromUrl(java.lang.String type, java.lang.String url) throws java.lang.Exception {
    java.io.InputStream inputStream = new java.net.URL(url).openStream();
    org.wso2.carbon.tools.wsdlvalidator.WSDLValidationInfo info = validaWSDLFromURI(inputStream);
    return dataPacker(info);
}