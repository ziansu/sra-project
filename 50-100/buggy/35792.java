@java.lang.Override
public void run() {
    try {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(clientSocket.getInputStream()));
        java.lang.String info;
        while ((info = bufferedReader.readLine()) != null) {
            android.util.Log.d("server", ("info: " + info));
        } 
        sendMessage();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}