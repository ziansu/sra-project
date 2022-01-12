@java.lang.Override
public void run() {
    while (true) {
        try {
            java.lang.String s = inFromServer.readLine();
            this.tcpConnectionHandler.obtainMessage(1, new org.json.JSONObject(s)).sendToTarget();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    } 
}