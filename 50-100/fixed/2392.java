public void close() {
    if (((musicItems) != null) && ((musicItems.size()) > 0)) {
        nomusic.setVisibility(View.GONE);
        musiclist.setAdapter(new com.salt.saltmusic.Home.MusicListAdapter());
    }else {
        nomusic.setVisibility(View.VISIBLE);
    }
}