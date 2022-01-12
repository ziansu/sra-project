@java.lang.Override
protected void onBasicMessage(T basicMessage) {
    if (!(isDone())) {
        state = org.hawkular.bus.common.consumer.FutureBasicMessageListener.State.DONE;
        if (responseQ.offer(basicMessage)) {
            executionList.execute();
        }else {
            msglog.errorCannotStoreIncomingMessageFutureInvalid();
            state = org.hawkular.bus.common.consumer.FutureBasicMessageListener.State.CANCELLED;
        }
        try {
            closeConsumer();
        } catch (java.lang.Exception e) {
            msglog.errorFailedToCloseFutureConsumer(e);
        }
    }
}