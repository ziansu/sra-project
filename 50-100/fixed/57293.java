private boolean isPlaylist(org.y20k.transistor.core.Station.ContentType contentType) {
    if ((contentType != null) && ((contentType.type) != null)) {
        for (java.lang.String[] array : new java.lang.String[][]{ CONTENT_TYPES_PLS , CONTENT_TYPES_M3U }) {
            if (java.util.Arrays.asList(array).contains(contentType.type)) {
                return true;
            }
        }
    }
    return false;
}