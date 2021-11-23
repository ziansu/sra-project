public boolean serializeTasks(java.util.List<sg.edu.nus.eydis.models.Task> tasks) {
    java.lang.String json = gson.toJson(tasks);
    try {
        java.io.FileWriter writer = new java.io.FileWriter(_filePathAndName);
        writer.write(json);
        writer.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return true;
}