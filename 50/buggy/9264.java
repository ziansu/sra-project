public void midiSystemUpdated() throws uk.co.xfactorylibrarians.coremidi4j.CoreMidiException {
    uk.co.xfactorylibrarians.coremidi4j.CoreMidiDeviceProvider.midiProperties.deviceMap.clear();
    buildDeviceMap();
}