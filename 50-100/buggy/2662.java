public void run() {
    for (int i = 0; i < (main.java.com.distributed.Node.Mn); i++) {
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new main.java.com.distributed.Node.UpdateTask(), ((main.java.com.distributed.Node.N) * 1000));
    }
    java.lang.System.exit(0);
}