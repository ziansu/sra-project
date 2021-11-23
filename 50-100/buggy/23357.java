public void pickTrainerMusic() {
    int choice = utilities.RandomNumUtils.generateRandom(audio.AudioLibrary.getInstance().m_trackList.size(), 0);
    java.lang.String songTitle = audio.AudioLibrary.getInstance().m_encounterTracks.get(choice);
    this.playBackgroundMusic(songTitle);
}