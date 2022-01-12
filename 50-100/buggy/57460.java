private void triggerChange(com.bionic.kvt.serviceapp.models.LMRAModel lmraModel) {
    com.bionic.kvt.serviceapp.dialogs.LMRADialog lmraDialog = new com.bionic.kvt.serviceapp.dialogs.LMRADialog();
    lmraDialog.setTitleId(R.string.none);
    lmraDialog.setEdit(true);
    com.bionic.kvt.serviceapp.activities.LMRAActivity.currentLMRAID = lmraModel.getLmraId();
    lmraDialog.show(((android.support.v4.app.FragmentActivity) (context)).getSupportFragmentManager(), "Modified dialog");
    notifyDataSetChanged();
}