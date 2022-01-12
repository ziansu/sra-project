public void run() {
    dataReadDisruptor = new com.lmax.disruptor.dsl.Disruptor<org.wso2.siddhi.debs2016.Processors.DEBSEvent>(new com.lmax.disruptor.EventFactory<org.wso2.siddhi.debs2016.Processors.DEBSEvent>() {
        @java.lang.Override
        public org.wso2.siddhi.debs2016.Processors.DEBSEvent newInstance() {
            return new org.wso2.siddhi.debs2016.Processors.DEBSEvent();
        }
    }, org.wso2.siddhi.debs2016.Processors.Q1EventManager.bufferSize, java.util.concurrent.Executors.newFixedThreadPool(3), com.lmax.disruptor.dsl.ProducerType.SINGLE, new com.lmax.disruptor.SleepingWaitStrategy());
    org.wso2.siddhi.debs2016.Processors.Q1EventManager.DEBSEventHandler debsEventHandler = new org.wso2.siddhi.debs2016.Processors.Q1EventManager.DEBSEventHandler();
    dataReadDisruptor.handleEventsWith(debsEventHandler);
    dataReadBuffer = dataReadDisruptor.start();
}