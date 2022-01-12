public static com.devbrackets.android.exomedia.util.MediaUtil.MediaType getMediaType(java.lang.String mediaUri) {
    java.lang.String extension = com.devbrackets.android.exomedia.util.MediaUtil.getExtension(mediaUri);
    if (extension == null) {
        return com.devbrackets.android.exomedia.util.MediaUtil.MediaType.UNKNOWN;
    }
    for (com.devbrackets.android.exomedia.util.MediaUtil.MediaType type : com.devbrackets.android.exomedia.util.MediaUtil.MediaType.values()) {
        if (type.getExtension().equals(extension)) {
            return type;
        }
    }
    return com.devbrackets.android.exomedia.util.MediaUtil.MediaType.UNKNOWN;
}