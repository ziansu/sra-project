public dev.spocht.spocht.data.Event addEvent(final java.lang.String name) {
    dev.spocht.spocht.data.Event event = new dev.spocht.spocht.data.Event(name);
    setEvent(event);
    if ((null == (event.facility().getObjectId())) || (!(event.facility().getObjectId().equals(this.getObjectId())))) {
        event.setFacility(this);
    }
    return event;
}