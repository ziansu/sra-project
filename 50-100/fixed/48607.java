public void onItemClick(android.widget.AdapterView<?> av, android.view.View v, int arg2, long arg3) {
    java.lang.String info = ((android.widget.TextView) (v.findViewById(R.id.textView))).getText().toString();
    address = info.substring(((info.length()) - 17));
    android.content.Intent i = new android.content.Intent(this, com.example.kmoreti.bluetoothcontrol.MainControl.class);
    i.putExtra(com.example.kmoreti.bluetoothcontrol.DeviceList.EXTRA_ADDRESS, address);
    startActivity(i);
}