private java.net.URL escapeIllegalURLCharacters(java.net.URL url) {
    if ((url == null) || (url.getProtocol().equals("file"))) {
        return url;
    }
    try {
        return org.apache.jmeter.protocol.http.util.ConversionUtils.sanitizeUrl(url).toURL();
    } catch (java.lang.Exception e1) {
        org.apache.jmeter.protocol.http.sampler.HTTPSamplerBase.log.error(((("Error escaping URL:'" + url) + "', message:") + (e1.getMessage())));
        return url;
    }
}