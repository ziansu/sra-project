public void onDeleteButtonClicked(android.view.View v) {
    if ((mEventPosition) <= 0) {
        finish();
        return ;
    }
    DataManager.INSTANCE.removeEvent(mEventPosition);
    android.content.Intent data = new android.content.Intent();
    data.putExtra(org.drykiss.android.app.sapphire.EventEditActivity.EXTRA_EVENT_DELETED, true);
    setResult(org.drykiss.android.app.sapphire.RESULT_OK, data);
    finish();
}