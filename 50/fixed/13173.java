@retrofit.http.GET(value = "/tracks?client_id=" + (Config.CLIENT_ID))
void getRecentTracks(@retrofit.http.Query(value = "user_id")
java.lang.String date, retrofit.Callback<java.util.List<com.bitzend.tuksosc.Track>> cb);