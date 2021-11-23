private imp.data.Note randomChordOrColorTone(imp.data.Chord chord, int duration) {
    if (chord.isNOCHORD()) {
        return new imp.data.Note(middleOfRange(), duration);
    }
    java.util.ArrayList<imp.data.Note> chordAndColorTones = imp.data.MelodyGenerator.chordAndColorTones(chord, duration);
    int size = chordAndColorTones.size();
    java.util.Random r = new java.util.Random();
    int choice = r.nextInt(size);
    imp.data.Note toReturn = chordAndColorTones.get(choice);
    return closestToMiddle(toReturn);
}