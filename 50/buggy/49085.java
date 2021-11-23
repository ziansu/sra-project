public static mainForm.MIDIEvent programChange(int deltaPPQ, int programNumber, int patchNumber) {
    return new mainForm.MIDIEvent(deltaPPQ, new int[]{ 255 , 192 + programNumber , patchNumber });
}