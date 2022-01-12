public int setBassHighRange(int lowRange) {
    int highRange;
    highRange = lowRange + 11;
    imp.data.PianoKey high = pianoKeys()[(highRange - (A))];
    java.lang.String name = high.getName();
    imp.data.NoteSymbol c = imp.data.NoteSymbol.makeNoteSymbol(name);
    highRange = c.getMIDI();
    notate.setBassHighRangeTF(name);
    return highRange;
}