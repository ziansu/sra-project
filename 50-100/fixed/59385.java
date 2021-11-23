private java.lang.String toJson(java.lang.String... params) {
    try {
        org.json.JSONObject obj = new org.json.JSONObject();
        obj.put("Email", params[0]);
        obj.put("Password", params[1]);
        obj.put("Telephone", params[2]);
        return obj.toString();
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return "";
    }
}