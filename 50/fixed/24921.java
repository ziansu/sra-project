public static synchronized void send(java.lang.String message) {
    if ((com.example.simon.battleships.GameManager.client) != null) {
        android.util.Log.e("Trying to send ", message);
        com.example.simon.battleships.GameManager.clientWrite = new com.example.simon.battleships.ClientWrite(com.example.simon.battleships.GameManager.client, message);
        com.example.simon.battleships.GameManager.clientWrite.start();
    }
}