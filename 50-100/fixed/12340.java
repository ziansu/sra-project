public void write(com.xenoage.utils.xml.XmlWriter writer) {
    writer.writeElementStart(com.xenoage.zong.musicxml.types.MxlMidiInstrument.elemName);
    writer.writeAttribute("id", id);
    writer.writeElementText("midi-channel", midiChannel);
    writer.writeElementText("midi-program", midiProgram);
    writer.writeElementText("pan", pan);
    writer.writeElementEnd();
}