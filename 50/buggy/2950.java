@java.lang.Override
public void onYesClick() {
    getActivity().onBackPressed();
    java.lang.String newNoteString = mSearchNewNoteDialogView.getNewNoteString();
    mSearchModel.addNewNote(newNoteString);
    if ((mOnDialogFinishListener) != null) {
        mOnDialogFinishListener.onNewNoteDone(newNoteString);
    }
}