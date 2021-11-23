public imp.data.Part getPart(int target) {
    int beatValue = ((BEAT) * 4) / (metre[1]);
    imp.data.Part newPart = new imp.data.Part();
    newPart.setMetre(metre[0], metre[1]);
    imp.data.Note note = imp.data.Key.makeNote(advice, imp.data.advice.C4, (beatValue / 2));
    note.setRhythmValue((beatValue / 2));
    newPart.addUnit(note);
    return newPart;
}