java.lang.CharSequence fromFile(java.lang.String filename) throws java.io.IOException {
    try (java.nio.channels.FileChannel channel = new java.io.FileInputStream(filename).getChannel()) {
        java.nio.ByteBuffer buffer = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0, ((int) (channel.size())));
        return java.nio.charset.Charset.forName("8859_1").newDecoder().decode(buffer);
    }
}