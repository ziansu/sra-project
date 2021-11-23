public ch.hevs.aislab.magpie.event.MagpieEvent registerEvent(ch.hevs.aislab.magpie.event.MagpieEvent event) {
    mQueueOfEvents.add(event);
    mEnvThread.newEventReceived();
    alertLatch = new java.util.concurrent.CountDownLatch(1);
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