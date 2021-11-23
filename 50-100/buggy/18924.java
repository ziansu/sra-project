public void endNote(music.Pitch rawPitch) {
    if ((state) == (piano.State.isrecording)) {
        listOfNote.add(new music.NoteEvent(rawPitch.transpose(currentPitchTranspose), java.lang.System.currentTimeMillis(), pianoInstrument, music.NoteEvent.Kind.stop));
    }else {
        midi.endNote(rawPitch.transpose(currentPitchTranspose).toMidiFrequency(), pianoInstrument);
    }
}