@java.lang.Override
public void receive(org.wso2.siddhi.core.event.Event[] events) {
    org.wso2.siddhi.core.util.EventPrinter.print(events);
    for (org.wso2.siddhi.core.event.Event event : events) {
        switch (count.incrementAndGet()) {
            case 1 :
                org.testng.AssertJUnit.assertEquals("WSO2", event.getData(0));
                break;
            default :
                org.wso2.extension.siddhi.map.keyvalue.sourcemapper.KeyValueSourceMapperTestCase.log.error((("Received more than expected number of events. Expected maximum : 1," + "Received : ") + (count.get())));
                org.testng.AssertJUnit.fail();
        }
    }
}