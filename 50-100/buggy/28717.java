@java.lang.Override
public void run() {
    try {
        g.startDigging();
        java.lang.System.out.println("Acquiring order semaphore.");
        GardenTest.orderSem.acquire();
        myOrder = (GardenTest.order)++;
        java.lang.System.out.println("Releasing order semaphore.");
        java.lang.System.out.println(("myOrder: " + (GardenTest.order)));
        GardenTest.orderSem.release();
        java.util.concurrent.TimeUnit.SECONDS.sleep(1);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("Exception: " + (e.getMessage())));
    }
    java.lang.System.out.println("Trying to finish digging.");
    g.doneDigging();
}