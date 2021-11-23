private static double noteToFreq(int key) {
    int note = key % (edu.utexas.cs.nn.util.sound.MIDIUtil.NOTES_IN_OCTAVE);
    int octave = (key / (edu.utexas.cs.nn.util.sound.MIDIUtil.NOTES_IN_OCTAVE)) - 1;
    return (edu.utexas.cs.nn.util.sound.MIDIUtil.NOTES[note]) * (java.lang.Math.pow(2.0, (((double) (octave)) - 1.0)));
}