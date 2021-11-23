public void receiveHash(java.lang.String data) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String str = gson.fromJson(data, java.lang.String.class);
    hashReceived = true;
    lastHash = str;
}