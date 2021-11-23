public void setPitchValue(char note, int octave) {
    this.pitchValue = note * (music.logic.elements.Note.noteSymbolToNoteValue.get(note));
}