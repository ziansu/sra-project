public void bindNote(com.selfassu.notepad.bean.Note note) {
    mNote = note;
    mTitleTextView.setText(mNote.getTitle());
    mContentTextView.setText(mNote.getContent());
    mDateTextView.setText(mNote.getDate().toString());
}