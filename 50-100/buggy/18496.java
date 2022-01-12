public wseemann.media.Metadata getMetadata(final boolean update_only, final boolean apply_filter) {
    wseemann.media.Metadata data = new wseemann.media.Metadata();
    java.util.HashMap<java.lang.String, java.lang.String> metadata = native_getMetadata();
    if (!(data.parse(metadata))) {
        return null;
    }
    return data;
}