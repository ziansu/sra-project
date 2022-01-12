public static com.pgmacdesign.myvideogamesv2.VideoGames deserializeTheJSON(com.pgmacdesign.myvideogamesv2.VideoGames videoGames, java.lang.String JSONString) {
    com.google.gson.GsonBuilder gsonBuilder = new com.google.gson.GsonBuilder();
    com.google.gson.Gson gson = gsonBuilder.create();
    try {
        videoGames = gson.fromJson(JSONString, com.pgmacdesign.myvideogamesv2.VideoGames.class);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return videoGames;
}