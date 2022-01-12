@java.lang.Override
public void onHandshakeResponse(java.lang.String reply) {
    android.util.Log.d(edu.mtu.cs3421.voto.MainActivity.TAG, "Handshake Recieved");
    startSession();
}