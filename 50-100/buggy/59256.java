private void processNote(int nextByte) {
    int note = com.bibler.awesome.nesmusiccomposer.audio.NoteTable.getNote(nextByte);
    java.lang.System.out.println(("Processing note: " + (java.lang.Integer.toHexString(note))));
    stream.write(periodLowRegister, (note & 255));
    stream.write(periodHighRegister, ((note >> 8) & 255));
}