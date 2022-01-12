public org.jlab.io.base.DataEvent gotoEvent(int index) {
    if ((index >= (this.minEventNumber)) && (index < (this.numberOfEvent))) {
        this.currentEventNumber = index;
        byte[] array = this.reader.readEvent(this.currentEventNumber);
        (this.currentEventNumber)++;
        org.jlab.io.hipo.HipoDataEvent evioEvent = new org.jlab.io.hipo.HipoDataEvent(array, this.reader.getSchemaFactory());
        return evioEvent;
    }
    return null;
}