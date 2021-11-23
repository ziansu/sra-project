public void execute() {
    org.geogebra.common.main.App.debug(((((((("[MIDIW] ch: " + ch) + " note: ") + note) + " velocity: ") + velocity) + " time: ") + time));
    sendNote(0, ch, note, velocity, time);
}