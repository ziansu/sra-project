@java.lang.Override
public void onDeleteOkClick() {
    if ((mWantToDelete) != (-1)) {
        deleteEntirely(mWantToDelete);
    }else {
        deleteAllItems();
    }
}