private void downloadFile(java.io.File posterFile, java.lang.String url) {
    try {
        java.net.URL posterUrl = new java.net.URL(url);
        java.nio.channels.ReadableByteChannel rbc = java.nio.channels.Channels.newChannel(posterUrl.openStream());
        java.io.FileOutputStream fos = new java.io.FileOutputStream(posterFile);
        fos.getChannel().transferFrom(rbc, 0, java.lang.Long.MAX_VALUE);
        fos.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}