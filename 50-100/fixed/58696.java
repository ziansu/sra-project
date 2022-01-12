private org.json.JSONArray jsonFileReader(java.io.File file) {
    org.json.JSONArray temp = new org.json.JSONArray();
    try {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(file));
        java.lang.String line;
        java.lang.String lines = "";
        while ((line = br.readLine()) != null) {
            lines += line;
        } 
        temp = new org.json.JSONArray(lines);
    } catch (java.io.IOException | org.json.JSONException e) {
        e.printStackTrace();
    }
    return temp;
}