@java.lang.Override
protected void onBasicMessage(T basicMessage) {
    if (!(isDone())) {
        if (responseQ.offer(basicMessage)) {
            state = org.hawkular.bus.common.consumer.FutureBasicMessageListener.State.DONE;
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