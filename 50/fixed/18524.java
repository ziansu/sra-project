@java.lang.Override
public void run() {
    while (running) {
        sendStr(new java.util.Scanner(java.lang.System.in).nextLine());
    } 
    InThread.interrupt();
}