public void adjustVolume(javax.sound.midi.Sequence musicSeq, int volume) throws javax.sound.midi.InvalidMidiDataException {
    javax.sound.midi.Track[] tracks = musicSeq.getTracks();
    for (javax.sound.midi.Track t : tracks) {
        for (int channel = 0; channel < 16; channel++) {
            t.add(new javax.sound.midi.MidiEvent(new javax.sound.midi.ShortMessage(javax.sound.midi.ShortMessage.CONTROL_CHANGE, channel, 7, volume), 0));
        }
    }
}