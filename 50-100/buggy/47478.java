public boolean isDisappearingEvent(org.opennms.netmgt.xml.eventconf.Event e) {
    if ("donotpersist".equalsIgnoreCase(e.getLogmsg().getDest())) {
        return true;
    }
    if (((e.getAlarmData()) != null) && ((e.getAlarmData().getAutoClean()) == true)) {
        return true;
    }
    return false;
}