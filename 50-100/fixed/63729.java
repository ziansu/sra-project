private java.lang.String addPageEncoding(org.apache.jmeter.samplers.SampleResult result) {
    java.lang.String pageEncoding = null;
    try {
        pageEncoding = org.apache.jmeter.protocol.http.util.ConversionUtils.getEncodingFromContentType(result.getContentType());
    } catch (java.nio.charset.IllegalCharsetNameException ex) {
        org.apache.jmeter.protocol.http.proxy.JMeterProxy.LOG.warn((("Unsupported charset detected in contentType:'" + (result.getContentType())) + "', will continue processing with default charset"), ex);
    }
    if (pageEncoding != null) {
        java.lang.String urlWithoutQuery = getUrlWithoutQuery(result.getURL());
        pageEncodings.put(urlWithoutQuery, pageEncoding);
    }
    return pageEncoding;
}