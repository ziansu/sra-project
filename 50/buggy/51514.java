@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int selected_device) {
    rleblanc.ca.smokino.SmokinoApp app = ((rleblanc.ca.smokino.SmokinoApp) (v.getContext().getApplicationContext()));
    app.setRemoteDevice(deviceList.get(selected_device));
    app.connect();
}