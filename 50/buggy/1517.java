private java.lang.String getHash(final jd.plugins.DownloadLink dl) {
    java.lang.String hash = dl.getStringProperty("plain_id", null);
    if (hash == null) {
        hash = dl.getStringProperty("hash_main", null);
    }
    return hash;
}