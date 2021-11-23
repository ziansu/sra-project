@java.lang.Override
public void run() {
    while (running) {
        sendStr(new java.lang.String(new java.util.Scanner(java.lang.System.in).nextLine().getBytes(), java.nio.charset.StandardCharsets.UTF_8));
    } 
    InThread.interrupt();
}