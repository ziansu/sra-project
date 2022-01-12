public java.util.List<Message> readJSON() throws java.io.IOException {
    java.util.List<Message> messages;
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("input.json"));
    messages = gson.fromJson(br, new com.google.gson.reflect.TypeToken<java.util.List<Message>>() {    }.getType());
    br.close();
    return messages;
}