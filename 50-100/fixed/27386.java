public void beginNote(music.Pitch rawPitch) {
    if ((state) == (piano.State.isrecording)) {
        listOfNote.add(new music.NoteEvent(rawPitch.transpose(currentPitchTranspose), java.lang.System.currentTimeMillis(), pianoInstrument, music.NoteEvent.Kind.start));
    }
    midi.beginNote(rawPitch.transpose(currentPitchTranspose).toMidiFrequency(), pianoInstrument);
}