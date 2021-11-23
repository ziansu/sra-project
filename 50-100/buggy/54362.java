private static void checkForSpecialMidiEvent(javax.sound.midi.MidiEvent thisEvent, java.util.HashMap<java.lang.Byte, javax.sound.midi.MidiEvent> thisTrackSpecialEvents) {
    java.lang.Byte midiStatusHash = mckay.utilities.sound.midi.MIDIMethods.getMidiMetaStatusHash(thisEvent);
    javax.sound.midi.MidiMessage thisMessage = thisEvent.getMessage();
    if (mckay.utilities.sound.midi.MIDIMethods.statusByteIsSpecial(thisMessage)) {
        thisTrackSpecialEvents.put(midiStatusHash, thisEvent);
    }
}