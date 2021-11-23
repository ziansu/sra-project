protected java.lang.String commonJsUrl(java.lang.String filepath, org.auraframework.system.AuraContext context, java.util.Map<java.lang.String, java.lang.Object> attributes) {
    java.lang.StringBuilder url = new java.lang.StringBuilder(context.getContextPath()).append("/l/");
    url.append(context.getEncodedURL(AuraContext.EncodingStyle.Normal));
    url.append(filepath);
    if (attributes != null) {
        addAttributes(url, attributes);
    }
    return url.toString();
}