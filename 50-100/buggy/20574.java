private void checkmsg(java.lang.String msg) {
    com.example.mychatapp.JsonReader jsonReader = com.example.mychatapp.Json.createReader(new java.io.StringReader(msg));
    com.example.mychatapp.JsonObject json = jsonReader.readObject();
    jsonReader.close();
    java.lang.String flag = json.getString("flag");
    if (flag.equals("self")) {
        android.content.SharedPreferences.Editor e = sp.edit();
        e.putString("session", json.getString("sessionId"));
        e.commit();
    }
}