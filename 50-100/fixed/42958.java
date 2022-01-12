@java.lang.Override
public void fill(org.jctools.queues.Supplier<E> s, org.jctools.queues.WaitStrategy w, org.jctools.queues.ExitCondition exit) {
    while (exit.keepRunning()) {
        while (((fill(s, MpmcArrayQueue.RECOMENDED_OFFER_BATCH)) != 0) && (exit.keepRunning())) {
            continue;
        } 
        int idleCounter = 0;
        while ((exit.keepRunning()) && ((fill(s, MpmcArrayQueue.RECOMENDED_OFFER_BATCH)) == 0)) {
            idleCounter = w.idle(idleCounter);
        } 
    } 
}