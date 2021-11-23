@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.upload_files_btn_cancel)) {
        setResult(com.owncloud.android.ui.activity.RESULT_CANCELED);
        finish();
    }else
        if ((v.getId()) == (R.id.upload_files_btn_upload)) {
            new com.owncloud.android.ui.activity.UploadFilesActivity.CheckAvailableSpaceTask().execute(((mBehaviourSpinner.getSelectedItemPosition()) == 0));
        }
    
}