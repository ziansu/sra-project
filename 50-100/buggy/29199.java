public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    android.util.Log.d(edu.mtu.cs3421.voto.MainActivity.TAG, "Got result from scanning network");
    if ((requestCode == 1) && (data != null)) {
        java.lang.String ipAddress = data.getStringExtra("IP_ADDRESS");
        java.lang.String name = data.getStringExtra("HOST_NAME");
        android.util.Log.d(edu.mtu.cs3421.voto.MainActivity.TAG, ((("Name:" + name) + "IP: ") + ipAddress));
        hostIpTxt.setText(ipAddress);
        hostNameTxt.setText(name);
    }
}