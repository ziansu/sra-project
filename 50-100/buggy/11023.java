public void run() {
    byte[] buffer = new byte[1024];
    int bytes;
    while (true) {
        try {
            bytes = mmInStream.read(buffer);
            mHandler.obtainMessage(3, bytes, (-1), buffer).sendToTarget();
        } catch (java.io.IOException e) {
            android.widget.Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
        }
    } 
}