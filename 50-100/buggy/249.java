public java.util.List<Message> readJSON(java.lang.String file) throws java.io.IOException {
    java.util.List<Message> messages = new java.util.ArrayList<Message>();
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("input.json"));
    messages = gson.fromJson(br, new com.google.gson.reflect.TypeToken<java.util.List<Message>>() {    }.getType());
    br.close();
    return messages;
}