public void stopNote(int note) {
    java.util.List<nl.zeesoft.zmmt.synthesizer.MidiNote> notes = getNotes(note, false);
    lockMe(this);
    player.stopInstrumentNotes(notes);
    unlockMe(this);
}