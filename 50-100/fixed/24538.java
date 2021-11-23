public org.opennms.netmgt.xml.eventconf.Event createBasicEvent() {
    org.opennms.features.vaadin.events.Event e = new org.opennms.features.vaadin.events.Event();
    e.setUei("uei.opennms.org/newEvent");
    e.setEventLabel("New Event");
    e.setDescr("New Event Description");
    e.setLogmsg(new org.opennms.netmgt.xml.eventconf.Logmsg());
    e.getLogmsg().setContent("New Event Log Message");
    e.getLogmsg().setDest("logndisplay");
    e.setSeverity("Indeterminate");
    e.setMask(new org.opennms.netmgt.xml.eventconf.Mask());
    return e;
}