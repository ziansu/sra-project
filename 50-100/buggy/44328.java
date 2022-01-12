@java.lang.Override
public void run() {
    for (int i = 0; i < 4; i++) {
        try {
            java.lang.Thread.sleep(1000);
            q.offer(i);
            java.lang.System.out.println("Producer1 added: ");
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}