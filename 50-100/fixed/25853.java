private void publish() {
    java.lang.Boolean allReady = true;
    for (com.peebeekay.fx.simulation.data.IDataSubscriber subscriber : subscribers) {
        allReady &= subscriber.isReady();
    }
    if (allReady) {
        com.peebeekay.fx.simulation.data.Price publishPrice = cache.poll();
        for (com.peebeekay.fx.simulation.data.IDataSubscriber subscriber : subscribers) {
            subscriber.accept(publishPrice);
        }
    }
}