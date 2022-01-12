public void onSongClick(co.itgen.mginshe.tunecache.Song song, android.view.View view, int pos) {
    if (m_serviceIsBound) {
        if (!(m_mediaService.getListName().equals("ALL"))) {
            m_mediaService.setSongList(m_media.getSongs());
            m_mediaService.setListName("ALL");
        }
        m_mediaService.playSong(song);
    }else {
        android.widget.Toast.makeText(this, "The media player service hasn't initialized yet. Please try again in a few seconds.", Toast.LENGTH_LONG).show();
    }
}