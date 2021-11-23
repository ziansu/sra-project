private void updateNote() {
    int i = random.nextInt(mNotes.size());
    currentNote = mNotes.remove(i);
    noteImage.setImageResource(currentNote.getResId());
}