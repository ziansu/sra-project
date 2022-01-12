public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isDSRC) {
    Globals.ADHOC_IFACE_NAME = (isDSRC) ? "usb0" : "eth0";
    Globals.ADHOC_SEND_PORT = (isDSRC) ? 4200 : 4200;
    Globals.ADHOC_RECV_PORT = (isDSRC) ? 5001 : 4200;
    Globals.CLOUD_PORT = (isDSRC) ? 50000 : 50001;
    log(java.lang.String.format("selected interface %s, send port %d, recv port %d, cloud port %d", Globals.ADHOC_IFACE_NAME, Globals.ADHOC_SEND_PORT, Globals.ADHOC_RECV_PORT, Globals.CLOUD_PORT));
}