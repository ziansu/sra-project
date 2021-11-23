public void pickTrainerMusic() {
    if ((m_encounterTracks.size()) > 0) {
        int choice = utilities.RandomNumUtils.generateRandom(m_encounterTracks.size(), 0);
        java.lang.String songTitle = m_encounterTracks.get(choice);
        this.playBackgroundMusic(songTitle);
    }
}