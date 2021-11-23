private void saveBuffers() {
    for (final com.radicalninja.logger.Buffer buffer : buffers) {
        try {
            writeToFile(buffer);
        } catch (java.io.IOException | java.lang.NullPointerException e) {
            final java.lang.String msg = java.lang.String.format("Unable to save %s contents to disk.", buffer.getClass().getSimpleName());
            android.util.Log.e(com.radicalninja.logger.LogManager.TAG, msg, e);
        }
    }
}