public static org.json.JSONObject getObject(java.lang.String path) {
    java.nio.file.Path p = new java.io.File(path).toPath();
    if (!(p.toFile().exists())) {
        throw new java.lang.RuntimeException("Configuration file does not exist!");
    }
    try {
        return new org.json.JSONObject(new java.lang.String(java.nio.file.Files.readAllBytes(p), java.nio.charset.StandardCharsets.UTF_8));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}