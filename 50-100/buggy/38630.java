public void serializeStatusesToJSON(java.util.ArrayList<twitter4j.Status> tweets) throws java.io.FileNotFoundException {
    java.io.PrintWriter out = new java.io.PrintWriter("tweets.json");
    com.google.gson.Gson gson = new com.google.gson.Gson();
    for (int i = 0; i < (tweets.size()); i++) {
        out.println(gson.toJson(tweets.get(i)));
    }
    out.close();
}