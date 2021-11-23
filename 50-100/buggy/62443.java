public void replaceQueue(java.util.ArrayList<ngo.music.player.Model.Song> songs) {
    org.json.JSONArray array = new org.json.JSONArray();
    for (ngo.music.player.Model.Song song : songs) {
        org.json.JSONObject songObject = createSongJSONObject(song.getAttribute("song_id"));
        array.put(songObject);
    }
    try {
        this.models.get(0).getJSONObject().put("songs", array);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    storeData();
}