public void request_connect_handler(android.view.View v) {
    android.widget.Toast.makeText(this, "request connect others device", Toast.LENGTH_LONG).show();
    is_client = true;
    init();
    get_Bonded_device_and_chat();
    bRequest_connect.setVisibility(View.GONE);
    bWait_connect.setVisibility(View.GONE);
}