@java.lang.Override
public void run() {
    try {
        while (true) {
            java.lang.Thread.sleep(5000);
            com.xm.counter.Util.SerializeCounter(counter);
            java.lang.System.out.println(("PersistenceThread save counter to " + (com.xm.counter.Util.getFileName())));
        } 
    } catch (java.lang.InterruptedException e) {
        java.lang.System.out.println("I was interrupted!");
        e.printStackTrace();
    }
}