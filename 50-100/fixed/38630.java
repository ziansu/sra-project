public void serializeStatusesToJSON(java.util.ArrayList<twitter4j.Status> tweets) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    for (int i = 0; i < (tweets.size()); i++) {
        out.println(gson.toJson(tweets.get(i)));
    }
}