public void playSequenceNote(int ch, int note, int velocity, double time) {
    if (!(isValid())) {
        return ;
    }
    org.geogebra.common.main.App.debug(((((((("[MIDIW] ch: " + ch) + " note: ") + note) + " velocity: ") + velocity) + " time: ") + time));
    sendNote(0, ch, note, velocity, time);
}