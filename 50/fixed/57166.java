public void play() {
    if (mServiceBound) {
        musicService.playSong();
        playerViewPager.notifyDataSetChanged();
        vpSongPlaying.setCurrentItem(musicObject.getIndexOfCurrentSong());
    }
}