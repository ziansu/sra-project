@java.lang.Override
protected void showRationale() {
    new android.support.v7.app.AlertDialog.Builder(getActivity()).setTitle("Permission Needed").setMessage("Permission rationale here").setNegativeButton("Cancel", null).setPositiveButton("Request Permission", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            performPermissionRequest();
        }
    }).show();
}