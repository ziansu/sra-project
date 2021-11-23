@java.lang.Override
protected void onPostExecute(java.lang.Void param) {
    if ((org.adaptlab.chpir.android.activerecordcloudsync.ActiveRecordCloudSync.getAuthToken()) != null) {
        new org.adaptlab.chpir.android.participanttracker.tasks.SyncTablesTask(getActivity()).execute();
    }else {
        new android.app.AlertDialog.Builder(getActivity()).setMessage(R.string.email_password_mismatch).setPositiveButton(R.string.okay, new android.content.DialogInterface.OnClickListener() {
            public void onClick(android.content.DialogInterface dialog, int button) {
            }
        }).show();
    }
}