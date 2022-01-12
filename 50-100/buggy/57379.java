private void removeNote(java.util.List<java.lang.Integer> square, int value) {
    if ((notes.get(square).indexOf(value)) > (-1)) {
        notes.get(square).remove(notes.get(square).indexOf(value));
    }
}