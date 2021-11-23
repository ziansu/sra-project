public void playNextTrack() {
    if ((trackPosNr) < ((tracks.size()) - 1))
        setTrack((++(trackPosNr)));
    
}