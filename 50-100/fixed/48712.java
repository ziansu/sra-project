public void selectTrack(int index) {
    javax.sound.midi.Track track = memory.selectedPattern().getTrack(index);
    if (trackSelectMode) {
        javax.sound.midi.Track currentTrack = memory.selectedTrack();
        memory.select(track);
        display.displayTrack(currentTrack, true);
        display.displayTrack(track, true);
    }else {
        track.setEnabled((!(track.isEnabled())));
        display.displayTrack(track);
    }
}