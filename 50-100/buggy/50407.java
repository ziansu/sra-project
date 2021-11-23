@java.lang.Override
public void receive(org.wso2.siddhi.core.event.Event[] events) {
    org.wso2.siddhi.core.util.EventPrinter.print(events);
    for (org.wso2.siddhi.core.event.Event event : events) {
        if (event.isExpired()) {
            junit.framework.Assert.fail("Remove events emitted");
        }else {
            count.incrementAndGet();
            junit.framework.Assert.assertTrue((("192.10.1.3".equals(event.getData(0))) || ("192.10.1.4".equals(event.getData(0)))));
        }
        eventArrived = true;
    }
}