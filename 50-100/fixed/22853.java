public static final long getFileSize_Type(java.lang.String url, java.lang.String userAgent, java.util.Map<java.lang.String, java.lang.String> headers) {
    switch (sune.etc.faso.video.VideoFormat.get(url)) {
        case M3U8 :
            return sune.etc.faso.util.Utils.FILE_SIZE_M3U8 ? sune.etc.faso.util.Utils.getFileSizeURL_M3U8(url, userAgent, headers) : -1;
        default :
            return sune.etc.faso.util.Utils.getFileSizeURL(url, userAgent, headers);
    }
}