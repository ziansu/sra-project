@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    boolean connection = mBluetoothLeService.connect(device.getAddress());
    if (connection) {
        rootview.setVisibility(View.VISIBLE);
        connect_button_view.setVisibility(View.GONE);
        android.widget.Toast.makeText(this, getBaseContext().getResources().getString(R.string.toast_successfull_connection), Toast.LENGTH_SHORT).show();
    }
    dialog.dismiss();
}