public void writeJSON(org.json.JSONObject obj) {
    try {
        java.io.FileWriter fw = new java.io.FileWriter(file);
        java.lang.System.out.println(("What's being written: " + (obj.toString())));
        fw.write(obj.toString());
        fw.flush();
        fw.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}