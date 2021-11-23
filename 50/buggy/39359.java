public void jumpToQueuePosition(int id) {
    mTimeline.setCurrentQueuePosition(id);
    setCurrentSong(0);
    play();
}