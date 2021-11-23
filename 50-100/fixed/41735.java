@java.lang.Override
public void saveMonitorEvent(org.jumpmind.symmetric.model.MonitorEvent event) {
    sqlTemplate.update(getSql("insertMonitorEventSql"), event.getMonitorId(), event.getNodeId(), event.getEventTime(), event.getHostName(), event.getType(), event.getValue(), event.getThreshold(), event.getSeverityLevel(), (event.isNotified() ? 1 : 0));
}