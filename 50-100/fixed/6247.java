void handleGeneric(@javax.annotation.Nullable
java.lang.String stream, @javax.annotation.Nonnull
java.lang.String status) {
    final java.lang.String value;
    if (stream != null) {
        value = com.spotify.plugin.dockerfile.LoggingProgressHandler.trimNewline(stream);
    }else {
        value = status;
    }
    for (java.lang.String line : com.spotify.plugin.dockerfile.LoggingProgressHandler.LINE_SPLITTER.split(value)) {
        log.info(line);
    }
}