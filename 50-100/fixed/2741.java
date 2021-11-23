public boolean serializeTasks(java.util.List<sg.edu.nus.eydis.models.Task> tasks) {
    java.lang.String json = gson.toJson(tasks);
    try {
        java.io.File file = new java.io.File(_filePathAndName);
        java.io.FileWriter writer = new java.io.FileWriter(file);
        writer.write(json);
        writer.close();
    } catch (java.io.IOException e) {
        return false;
    }
    return true;
}