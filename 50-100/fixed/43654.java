public int getProperty(final java.lang.String kmidipropertyoffline) throws com.github.osxmidi4j.CoreMidiException {
    final org.rococoa.ID propertyId = getPropertyId(kmidipropertyoffline);
    final java.nio.IntBuffer intBuffer = java.nio.IntBuffer.allocate(com.github.osxmidi4j.MidiEndpoint.BUFFER_SIZE);
    final int midiObjectGetIntegerProperty = CoreMidiLibrary.INSTANCE.MIDIObjectGetIntegerProperty(endpointref.longValue(), propertyId, intBuffer);
    if (midiObjectGetIntegerProperty != 0) {
        throw new com.github.osxmidi4j.CoreMidiException(((("endpointref " + (endpointref.longValue())) + " ") + midiObjectGetIntegerProperty));
    }
    return intBuffer.get();
}