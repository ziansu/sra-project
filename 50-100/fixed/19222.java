public void refresh(java.util.Collection<java.lang.String> indices) {
    io.searchbox.client.JestResult result = execute(new io.searchbox.indices.Refresh.Builder().addIndex(indices).build());
    if (!(result.isSucceeded())) {
        log.warn(((("Unable to refresh indices " + indices) + ": ") + (result.getErrorMessage())));
    }
}