public void switchCurrentSong(com.tomas.musicplayer.Song to) {
    currentSong = to;
    com.tomas.musicplayer.Current current = realm.where(com.tomas.musicplayer.Current.class).findFirst();
    realm.beginTransaction();
    if (current == null) {
        current = new com.tomas.musicplayer.Current();
        current.path = currentSong.getPath();
        realm.copyToRealm(current);
    }else {
        current.path = currentSong.getPath();
    }
    realm.commitTransaction();
}