private void setContentTypeInHTTPHeader() {
    org.apache.cxf.transports.http.configuration.HTTPClientPolicy httpClientPolicy = gov.hhs.fha.nhinc.messaging.service.decorator.cxf.WsAddressingServiceEndpointDecorator.getHTTPClientPolicy();
    java.lang.String contentType = httpClientPolicy.getContentType();
    if (gov.hhs.fha.nhinc.nhinclib.NullChecker.isNullish(contentType)) {
        contentType = "application/soap+xml; charset=UTF-8";
    }else {
        contentType = gov.hhs.fha.nhinc.messaging.service.decorator.cxf.WsAddressingServiceEndpointDecorator.removeActionFromContentType(contentType);
    }
    httpClientPolicy.setContentType(contentType);
}