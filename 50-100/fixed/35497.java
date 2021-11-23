private static int getPrev(int index, javax.sound.midi.Track cur, int Command) {
    for (int k = index - 1; k >= 0; --k) {
        javax.sound.midi.MidiMessage midNoteOff = cur.get(k).getMessage();
        if (midNoteOff instanceof javax.sound.midi.ShortMessage) {
            javax.sound.midi.ShortMessage noteOff = ((javax.sound.midi.ShortMessage) (midNoteOff));
            if ((noteOff.getCommand()) == Command) {
                return k;
            }
        }
    }
    return 0;
}