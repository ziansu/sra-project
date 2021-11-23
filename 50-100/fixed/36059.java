public void resetPossibilities() {
    possibleNotes.remove(((possibleNotes.size()) - 1));
    if ((size()) == 0) {
        java.util.HashMap<edu.du.cs.quinn.Music.Note, java.lang.Integer> allowableNotes = new java.util.HashMap<edu.du.cs.quinn.Music.Note, java.lang.Integer>();
        possibleNotes.add(allowableNotes);
        for (edu.du.cs.quinn.Music.Note n : edu.du.cs.quinn.Music.Key.getInstance().getSpanNotes(minPitch, maxPitch)) {
            allowableNotes.put(n, 0);
        }
    }else {
        setPossibilities();
    }
}