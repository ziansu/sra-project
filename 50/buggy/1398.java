@java.lang.Override
public void run() {
    message = INIT;
    gameManager.write(message.getBytes(java.nio.charset.Charset.defaultCharset()));
    new java.lang.Thread(new es.carlosrolindez.ping.GameFragment.GameRunnable(false)).start();
}