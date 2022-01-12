public static void addCorsResponseHeaders(com.eucalyptus.http.MappingHttpResponse mappingHttpResponse) throws com.eucalyptus.objectstorage.exceptions.s3.S3Exception {
    if ((mappingHttpResponse != null) && ((mappingHttpResponse.getMessage()) instanceof com.eucalyptus.objectstorage.msgs.ObjectStorageCommonResponseType)) {
        com.eucalyptus.objectstorage.util.OSGUtil.addCorsResponseHeaders(((org.jboss.netty.handler.codec.http.HttpResponse) (mappingHttpResponse)), ((com.eucalyptus.objectstorage.msgs.ObjectStorageCommonResponseType) (mappingHttpResponse.getMessage())));
    }
}