@java.lang.Override
public void run() throws java.lang.InterruptedException {
    while (((s.objects.closest("Fungi on log")) != null) && (!(inv.isFull()))) {
        org.osbot.rs07.api.model.RS2Object fungiObject = s.objects.closest("Fungi on log");
        if (fungiObject != null) {
            fungiObject.interact("Pick");
            new org.osbot.rs07.utility.ConditionalSleep(500, 100) {
                @java.lang.Override
                public boolean condition() {
                    return !(me.isMoving());
                }
            }.sleep();
        }
    } 
}