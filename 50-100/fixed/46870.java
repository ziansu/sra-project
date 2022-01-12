public org.jlab.io.base.DataEvent getPreviousEvent() {
    if ((this.currentEventNumber) > ((this.minEventNumber) + 1)) {
        (this.currentEventNumber)--;
        (this.currentEventNumber)--;
    }
    byte[] array = this.reader.readEvent(this.currentEventNumber);
    (this.currentEventNumber)++;
    org.jlab.io.hipo.HipoDataEvent evioEvent = new org.jlab.io.hipo.HipoDataEvent(array, this.reader.getSchemaFactory());
    return evioEvent;
}