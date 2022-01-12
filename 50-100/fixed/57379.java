private void removeNote(java.util.List<java.lang.Integer> square, int value) {
    if ((this.notes.get(square).indexOf(value)) > (-1)) {
        this.notes.get(square).remove(this.notes.get(square).indexOf(value));
    }
}