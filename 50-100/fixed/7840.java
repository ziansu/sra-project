@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    boolean connection = mBluetoothLeService.connect(device.getAddress());
    if (connection) {
        rootview.setVisibility(View.VISIBLE);
        connect_button_view.setVisibility(View.GONE);
    }
    dialog.dismiss();
}