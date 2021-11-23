public void bindNote(com.mememachine.mike.laboratorynotehelper.Note note) {
    mNote = note;
    mTitleTextView.setText(mNote.getTitle());
    mDateTextView.setText(mNote.getStringDate());
    mCellTypeTextView.setText(mNote.getCellType());
    if ((mNote.getBody()) != null) {
        java.lang.String body = mNote.getBody();
        mBodyTextView.setText(body.substring(0, java.lang.Math.min(body.length(), 200)));
    }
}