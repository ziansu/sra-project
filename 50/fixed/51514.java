@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int selected_device) {
    app.setRemoteDevice(deviceList.get(selected_device));
    app.connect();
}