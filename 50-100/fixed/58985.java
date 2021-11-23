private void updateDone(int msg, android.os.Bundle data) {
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