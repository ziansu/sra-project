public static void writeToFile(final java.lang.String path, final java.lang.Object obj) throws java.io.IOException {
    org.panthercode.arctic.core.arguments.ArgumentUtils.assertNotNull(obj, "object");
    try (java.io.FileOutputStream stream = new java.io.FileOutputStream(path)) {
        javax.xml.bind.JAXB.marshal(obj, stream);
    }
}