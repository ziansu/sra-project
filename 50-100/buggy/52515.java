public int updateScore() {
    totalText.setText(("" + (mAllNotes.size())));
    int difference = (mAllNotes.size()) - (mNotes.size());
    completedText.setText(("" + difference));
    return difference;
}