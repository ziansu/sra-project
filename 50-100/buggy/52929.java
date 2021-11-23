public static java.io.File createTemporaryFolder() throws java.io.IOException {
    java.io.File f = java.io.File.createTempFile("de.cimt.talendcomp.xmldynamic", "temp");
    f.deleteOnExit();
    java.io.File tf = new java.io.File(f.getParent(), java.util.UUID.randomUUID().toString().replaceAll("[\\.:-]+", ""));
    tf.mkdirs();
    tf.deleteOnExit();
    f.delete();
    return tf;
}