@java.lang.Override
public void receive(long timeStamp, org.wso2.siddhi.core.event.Event[] inEvents, org.wso2.siddhi.core.event.Event[] removeEvents) {
    org.wso2.siddhi.core.util.EventPrinter.print(timeStamp, inEvents, removeEvents);
    if (inEvents != null) {
        (value)++;
    }else
        if ((value) == 1) {
            junit.framework.Assert.assertNull(inEvents);
        }
    
    eventArrived = true;
}