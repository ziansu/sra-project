@java.lang.Override
public void receive(long timeStamp, org.wso2.siddhi.core.event.Event[] inEvents, org.wso2.siddhi.core.event.Event[] removeEvents) {
    org.wso2.siddhi.core.util.EventPrinter.print(timeStamp, inEvents, removeEvents);
    if (inEvents != null) {
        inEventCount = (inEventCount) + (inEvents.length);
    }
    if (removeEvents != null) {
        junit.framework.Assert.assertTrue("InEvents arrived before RemoveEvents", ((inEventCount) > (removeEventCount)));
        removeEventCount = (removeEventCount) + (removeEvents.length);
    }
    eventArrived = true;
}