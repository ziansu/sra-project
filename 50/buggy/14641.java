private java.lang.String mimeToExtension(final java.lang.String contentType) {
    switch (contentType) {
        case org.railwaystations.api.resources.PhotoUploadResource.IMAGE_PNG :
            return "png";
        case org.railwaystations.api.resources.PhotoUploadResource.IMAGE_JPEG :
            return "jpg";
    }
    throw new java.lang.IllegalArgumentException(("Unknown contentType " + contentType));
}