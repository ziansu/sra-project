@java.lang.Override
public void onBackPressed() {
    if (dataChanged) {
        setResultAction(miles.diary.ui.activity.EntryActivity.Action.EDIT);
    }else {
        super.onBackPressed();
    }
}