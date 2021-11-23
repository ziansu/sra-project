@java.lang.Override
public void onPrepareDialog(int id, android.app.Dialog d) {
    switch (id) {
        case com.forrestguice.thunderwatch.lib.ThunderClockApp.DIALOG_CLEAR_ID :
            break;
        case com.forrestguice.thunderwatch.lib.ThunderClockApp.DIALOG_CONFIRMDELETE_ID :
            java.lang.String msg = myParent.getString(R.string.msg_delete_confirm, selectedItem.getText());
            android.app.AlertDialog dialog = ((android.app.AlertDialog) (d));
            dialog.setMessage(msg);
            break;
    }
}