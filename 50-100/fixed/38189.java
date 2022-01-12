public java.lang.String getMimeType() {
    java.lang.String mimeType;
    java.lang.String extensionWithoutDot = getResourceLocation().getExtension().substring(1).toLowerCase();
    switch (findMediaType()) {
        case MOVIE :
            mimeType = "video/" + extensionWithoutDot;
            break;
        case IMAGE :
            mimeType = "image/" + extensionWithoutDot;
            break;
        default :
            return "application/octet-stream";
    }
    return mimeType;
}