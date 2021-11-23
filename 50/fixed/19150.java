public dist.esper.event.EventProperty getProperty(java.lang.String propName) {
    for (dist.esper.event.EventProperty p : propList) {
        if ((p != null) && (p.name.equals(propName))) {
            return p;
        }
    }
    return null;
}