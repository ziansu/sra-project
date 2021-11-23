protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewById(R.id.link_connected_devices).setVisibility(View.VISIBLE);
    findViewById(R.id.bt_icon_green).setVisibility(View.VISIBLE);
    findViewById(R.id.link_disconnected_devices).setVisibility(View.INVISIBLE);
    findViewById(R.id.bt_icon_gray).setVisibility(View.INVISIBLE);
}