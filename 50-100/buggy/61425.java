@java.lang.Override
public void run() {
    try {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
        com.google.gson.JsonParser jsonParser = new com.google.gson.JsonParser();
        mResponseLogTextView.setText(gson.toJson(jsonParser.parse(responseString)));
    } catch (java.lang.Exception e) {
        mResponseLogTextView.setText(responseString);
    }
}