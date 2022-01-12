public byte[] getData() {
    if (((data) == null) && ((stream) != null)) {
        try {
            data = com.google.common.io.ByteStreams.toByteArray(stream);
        } catch (java.io.EOFException e) {
            com.flightstats.hub.model.Content.logger.info("file ended early {}", contentKey);
        } catch (java.lang.Exception e) {
            com.flightstats.hub.model.Content.logger.warn(("no data " + (contentKey)), e);
        }
    }
    return data;
}