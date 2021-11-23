private void processNote(int nextByte) {
    int note = com.bibler.awesome.nesmusiccomposer.audio.NoteTable.getNote(nextByte);
    stream.write(periodLowRegister, (note & 255));
    stream.write(periodHighRegister, ((note >> 8) & 255));
}