public static java.io.File createTemporaryFolder() throws java.io.IOException {
    java.io.File f = java.io.File.createTempFile("de.cimt.talendcomp.xmldynamic", "temp");
    java.io.File tf = new java.io.File(f.getParent(), java.util.UUID.randomUUID().toString().replaceAll("[\\.:-]+", ""));
    f.delete();
    tf.mkdirs();
    tf.deleteOnExit();
    return tf;
}