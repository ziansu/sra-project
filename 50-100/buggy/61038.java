@java.lang.Override
protected void restoreState(java.lang.Object[] data) {
    window.restoreState(data);
    oldEventList = ((java.util.ArrayList<org.wso2.siddhi.core.event.remove.RemoveEvent>) (data[1]));
    newEventList = ((java.util.ArrayList<org.wso2.siddhi.core.event.in.InEvent>) (data[2]));
    window.reSchedule();
}