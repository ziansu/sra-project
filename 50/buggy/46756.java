public void pauseBackgrondMusic() {
    if ((audio.AudioLibrary.getInstance().m_currentTrack) != null) {
        audio.AudioLibrary.getInstance().m_currentTrack.stop();
    }
}