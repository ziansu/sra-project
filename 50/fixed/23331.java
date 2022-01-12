public boolean canTransformResource(java.lang.String resource) {
    return (org.apache.maven.plugins.shade.resource.ApacheNoticeResourceTransformer.NOTICE_PATH.equalsIgnoreCase(resource)) || (org.apache.maven.plugins.shade.resource.ApacheNoticeResourceTransformer.NOTICE_TXT_PATH.equalsIgnoreCase(resource));
}