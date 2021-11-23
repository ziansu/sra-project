public wseemann.media.Metadata getMetadata() {
    boolean update_only = false;
    boolean apply_filter = false;
    wseemann.media.Metadata data = new wseemann.media.Metadata();
    java.util.HashMap<java.lang.String, java.lang.String> metadata = null;
    if ((metadata = native_getMetadata(update_only, apply_filter, metadata)) == null) {
        return null;
    }
    if (!(data.parse(metadata))) {
        return null;
    }
    return data;
}