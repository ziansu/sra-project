public void setPitchValue(char note, int octave) {
    this.pitchValue = octave * (music.logic.elements.Note.noteSymbolToNoteValue.get(note));
}