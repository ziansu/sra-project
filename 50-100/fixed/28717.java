@java.lang.Override
public void run() {
    try {
        g.startDigging();
        GardenTest.orderSem.acquire();
        myOrder = (GardenTest.order)++;
        GardenTest.orderSem.release();
        java.util.concurrent.TimeUnit.SECONDS.sleep(1);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("Exception: " + (e.getMessage())));
    }
    g.doneDigging();
}