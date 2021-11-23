public static void writeObject(org.json.JSONObject object, java.lang.String path) {
    try {
        java.nio.file.Path p = new java.io.File(path).toPath();
        if (!(p.toFile().exists())) {
            throw new java.lang.RuntimeException("Configuration file does not exist!");
        }
        java.nio.file.Files.write(p, java.util.Arrays.asList(object.toString(2).split("\n")), java.nio.charset.StandardCharsets.UTF_8);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}