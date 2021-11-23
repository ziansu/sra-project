protected int getContentType(com.google.android.exoplayer2.Format format) {
    java.lang.String sampleMimeType = format.sampleMimeType;
    if (android.text.TextUtils.isEmpty(sampleMimeType)) {
        return com.google.android.exoplayer2.C.TRACK_TYPE_UNKNOWN;
    }else
        if (com.google.android.exoplayer2.util.MimeTypes.isVideo(sampleMimeType)) {
            return com.google.android.exoplayer2.C.TRACK_TYPE_VIDEO;
        }else
            if (com.google.android.exoplayer2.util.MimeTypes.isAudio(sampleMimeType)) {
                return com.google.android.exoplayer2.C.TRACK_TYPE_AUDIO;
            }else
                if ((com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.mimeTypeIsRawText(sampleMimeType)) || (MimeTypes.APPLICATION_RAWCC.equals(format.containerMimeType))) {
                    return com.google.android.exoplayer2.C.TRACK_TYPE_TEXT;
                }
            
        
    
    return com.google.android.exoplayer2.C.TRACK_TYPE_UNKNOWN;
}