@java.lang.Override
public void run() {
    while ((ackCount.get()) < (max)) {
        java.util.List<java.lang.Long> list = new java.util.ArrayList<>();
        list.add(((long) (ackCount.incrementAndGet())));
        newBitmap.ackOffset(list, Ack.SUCCESS);
    } 
}