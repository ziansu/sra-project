public boolean isDisappearingEvent(org.opennms.netmgt.xml.eventconf.Event e) {
    if (((e.getLogmsg()) != null) && ("donotpersist".equalsIgnoreCase(e.getLogmsg().getDest()))) {
        return true;
    }
    if (((e.getAlarmData()) != null) && ((e.getAlarmData().getAutoClean()) == true)) {
        return true;
    }
    return false;
}