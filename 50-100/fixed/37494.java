public com.awaker.server.json.Playlist toJSONPlaylist() {
    java.util.ArrayList<java.lang.Integer> idList = new java.util.ArrayList<>();
    if ((tracks) != null) {
        for (com.awaker.data.TrackWrapper track : tracks) {
            idList.add(track.getId());
        }
    }
    return new com.awaker.server.json.Playlist(id, name, idList);
}