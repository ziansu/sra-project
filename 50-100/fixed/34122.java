@java.lang.Override
public void onYesClick() {
    java.lang.String newNoteString = mPlayerNewNoteDialogView.getNewNoteString();
    wishcantw.vocabulazy.activities.player.model.PlayerModel playerModel = ((wishcantw.vocabulazy.activities.player.activity.PlayerActivity) (getActivity())).getPlayerModel();
    playerModel.addNewNote(newNoteString);
    getActivity().onBackPressed();
    if ((mOnDialogFinishListener) != null) {
        mOnDialogFinishListener.onNewNoteDone(newNoteString);
    }
}