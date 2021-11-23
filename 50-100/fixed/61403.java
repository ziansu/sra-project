@java.lang.Override
public void receive(long timeStamp, org.wso2.siddhi.core.event.Event[] inEvents, org.wso2.siddhi.core.event.Event[] removeEvents) {
    org.wso2.siddhi.core.util.EventPrinter.print(timeStamp, inEvents, removeEvents);
    eventArrived = true;
    if (inEvents != null) {
        count.incrementAndGet();
        for (org.wso2.siddhi.core.event.Event event : inEvents) {
            junit.framework.Assert.assertTrue((("192.10.1.5".equals(event.getData(0))) || ("192.10.1.3".equals(event.getData(0)))));
        }
        value += inEvents.length;
    }
}