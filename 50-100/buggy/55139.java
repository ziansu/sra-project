public static java.util.List<java.lang.String> getResourceFiles(java.lang.String path) throws java.io.IOException {
    java.util.List<java.lang.String> filenames = new java.util.ArrayList<>();
    try (java.io.InputStream in = io.tetrapod.core.utils.Util.getResourceAsStream(path);java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(in))) {
        java.lang.String resource;
        while ((resource = br.readLine()) != null) {
            filenames.add(resource);
        } 
    }
    return filenames;
}