@java.lang.Override
public void fill(org.jctools.queues.Supplier<E> s, org.jctools.queues.WaitStrategy w, org.jctools.queues.ExitCondition exit) {
    while (exit.keepRunning()) {
        while ((fill(s, MpmcArrayQueue.RECOMENDED_OFFER_BATCH)) != 0) {
            continue;
        } 
        int idleCounter = 0;
        while (((fill(s, MpmcArrayQueue.RECOMENDED_OFFER_BATCH)) == 0) && (exit.keepRunning())) {
            idleCounter = w.idle(idleCounter);
        } 
    } 
}