public void writeJSON(org.json.JSONObject obj) {
    try {
        java.io.FileWriter fw = new java.io.FileWriter(file);
        fw.write(obj.toString());
        fw.flush();
        fw.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}