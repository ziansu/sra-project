public static <T> void writeJSON(java.lang.String directory, java.lang.String filename, T data) throws java.io.IOException {
    java.io.File dir = new java.io.File(directory);
    if (!(dir.exists())) {
        dir.mkdirs();
    }
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String json = gson.toJson(data);
    java.io.FileWriter writer = new java.io.FileWriter((directory + filename));
    writer.write(json);
    writer.close();
}