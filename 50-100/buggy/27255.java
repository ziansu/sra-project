public static <T> T readFromFile(final java.lang.String path, final java.lang.Class<T> clazz) throws java.io.IOException {
    org.panthercode.arctic.core.arguments.ArgumentUtils.assertNotNull(path, "path");
    org.panthercode.arctic.core.arguments.ArgumentUtils.assertNotNull(clazz, "clazz");
    T result;
    try (java.io.FileInputStream stream = org.panthercode.arctic.core.io.IOUtils.toFileIntputStream(path)) {
        result = javax.xml.bind.JAXB.unmarshal(stream, clazz);
    }
    return result;
}