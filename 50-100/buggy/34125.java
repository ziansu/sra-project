@java.lang.Override
public void run() {
    while (true) {
        try {
            android.util.Log.i("log", "WAITING");
            java.lang.String s = inFromServer.readLine();
            android.util.Log.i("RECEIVED", s);
            this.tcpConnectionHandler.obtainMessage(1, new org.json.JSONObject(s)).sendToTarget();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    } 
}