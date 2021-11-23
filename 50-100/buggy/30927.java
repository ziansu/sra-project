@java.lang.Override
public void run() {
    if (!(isConnected)) {
        if (null != (mUsername))
            mSocket.emit("add user", mUsername);
        
        android.widget.Toast.makeText(getActivity().getApplicationContext(), R.string.connect, Toast.LENGTH_LONG).show();
        isConnected = true;
    }
}