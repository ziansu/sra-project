void destroy() {
    if ((detailsFile) != null) {
        java.io.FileOutputStream out = null;
        try {
            out = new java.io.FileOutputStream(detailsFile);
            details.store(out, null);
        } catch (final java.io.IOException e) {
            com.puppycrawl.tools.checkstyle.Utils.getExceptionLogger().debug("Unable to save cache file.", e);
        } finally {
            if (out != null) {
                this.flushAndCloseOutStream(out);
            }
        }
    }
}