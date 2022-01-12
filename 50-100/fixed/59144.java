private void saveJsonObjAsJSONFile(com.google.gson.JsonObject jsonObj) throws java.io.IOException {
    java.lang.String path = saveFile();
    if (path == null) {
        return ;
    }
    java.io.FileWriter file = new java.io.FileWriter(path);
    try {
        file.write(jsonObj.toString());
    } catch (java.io.IOException e) {
        displayErrorBox("Opening File", e.getMessage());
        e.printStackTrace();
    } finally {
        file.flush();
        file.close();
    }
}