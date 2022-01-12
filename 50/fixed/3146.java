protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case tw.sendmessageusebluetooth.MainActivity.REQUEST_CONNECT_DEVICE_SECURE :
            if (resultCode == (android.app.Activity.RESULT_OK)) {
                connectDevice(data);
            }
            break;
        default :
            break;
    }
}