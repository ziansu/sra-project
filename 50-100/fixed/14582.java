public ch.hevs.aislab.magpie.event.MagpieEvent registerEvent(ch.hevs.aislab.magpie.event.MagpieEvent event) {
    mQueueOfEvents.add(event);
    alertLatch = new java.util.concurrent.CountDownLatch(1);
    mEnvThread.newEventReceived();
    try {
        alertLatch.await();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    if (!(mQueueOfAlerts.isEmpty())) {
        return mQueueOfAlerts.poll();
    }else {
        return null;
    }
}