public static com.devbrackets.android.exomedia.util.MediaUtil.MediaType getMediaType(java.lang.String mediaUri) {
    java.lang.String extension = com.devbrackets.android.exomedia.util.MediaUtil.getExtension(mediaUri);
    if (extension == null) {
        return com.devbrackets.android.exomedia.util.MediaUtil.MediaType.UNKNOWN;
    }
    switch (extension) {
        case com.devbrackets.android.exomedia.util.MediaUtil.Extensions.AAC :
            return com.devbrackets.android.exomedia.util.MediaUtil.MediaType.AAC;
        case com.devbrackets.android.exomedia.util.MediaUtil.Extensions.M4A :
            return com.devbrackets.android.exomedia.util.MediaUtil.MediaType.M4A;
        case com.devbrackets.android.exomedia.util.MediaUtil.Extensions.MP3 :
            return com.devbrackets.android.exomedia.util.MediaUtil.MediaType.MP3;
        case com.devbrackets.android.exomedia.util.MediaUtil.Extensions.MP4 :
            return com.devbrackets.android.exomedia.util.MediaUtil.MediaType.MP4;
        case com.devbrackets.android.exomedia.util.MediaUtil.Extensions.TS :
            return com.devbrackets.android.exomedia.util.MediaUtil.MediaType.TS;
        case com.devbrackets.android.exomedia.util.MediaUtil.Extensions.WEBM :
            return com.devbrackets.android.exomedia.util.MediaUtil.MediaType.WEBM;
        default :
            return com.devbrackets.android.exomedia.util.MediaUtil.MediaType.UNKNOWN;
    }
}