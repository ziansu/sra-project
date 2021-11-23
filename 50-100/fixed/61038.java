@java.lang.Override
protected void restoreState(java.lang.Object[] data) {
    window.restoreState(((java.lang.Object[]) (data[0])));
    oldEventList = ((java.util.ArrayList<org.wso2.siddhi.core.event.remove.RemoveEvent>) (data[1]));
    newEventList = ((java.util.ArrayList<org.wso2.siddhi.core.event.in.InEvent>) (data[2]));
    window.reSchedule();
}