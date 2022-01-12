private android.app.Dialog D_introInfo() {
    android.content.res.Resources r = getResources();
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
    builder.setTitle(r.getString(R.string.D_introInfo_title)).setMessage(r.getString(R.string.D_introInfo)).setPositiveButton(R.string.OK, new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            dialog.cancel();
            D_introWeekSystem().show();
        }
    });
    return builder.create();
}