private void updateDone(int msg, android.os.Bundle data) {
    com.extenprise.mapp.medico.util.Utility.showProgressDialog(this, false);
    if (data.getBoolean("status")) {
        com.extenprise.mapp.medico.util.Utility.showAlert(this, "", getString(msg), new android.content.DialogInterface.OnClickListener() {
            @java.lang.Override
            public void onClick(android.content.DialogInterface dialog, int which) {
                dialog.dismiss();
                refresh();
            }
        });
    }
}