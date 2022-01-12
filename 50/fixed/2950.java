@java.lang.Override
public void onYesClick() {
    java.lang.String newNoteString = mSearchNewNoteDialogView.getNewNoteString();
    mSearchModel.addNewNote(newNoteString);
    getActivity().onBackPressed();
    if ((mOnDialogFinishListener) != null) {
        mOnDialogFinishListener.onNewNoteDone(newNoteString);
    }
}