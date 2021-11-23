@java.lang.Override
public void receive(org.wso2.siddhi.core.event.Event[] events) {
    org.wso2.siddhi.core.util.EventPrinter.print(events);
    for (org.wso2.siddhi.core.event.Event event : events) {
        switch (count.incrementAndGet()) {
            case 1 :
                junit.framework.Assert.assertEquals(55.6F, event.getData(1));
                break;
            default :
                org.junit.Assert.fail();
        }
    }
}