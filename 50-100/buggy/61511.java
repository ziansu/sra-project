@java.lang.Override
public java.util.ArrayList<de.voidplus.soundcloud.Playlist> getPlaylistByUser() {
    this.userAuthentication("", "");
    de.voidplus.soundcloud.User me = soundcloud.getMe();
    java.lang.Integer count = me.getPlaylistCount();
    java.util.ArrayList<de.voidplus.soundcloud.Playlist> all_playlists = new java.util.ArrayList<de.voidplus.soundcloud.Playlist>();
    try {
        for (int i = 0; i < count; i++) {
            java.util.ArrayList<de.voidplus.soundcloud.Playlist> temp_playlists = soundcloud.getMePlaylists();
            all_playlists.addAll(temp_playlists);
        }
    } catch (java.lang.NullPointerException e) {
    }
    return all_playlists;
}