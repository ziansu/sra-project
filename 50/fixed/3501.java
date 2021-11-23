@java.lang.Override
public void handleMessage(android.os.Message msg) {
    android.os.Bundle bundle = msg.getData();
    pictureData = bundle.getByteArray("pictureData");
    sendData();
}