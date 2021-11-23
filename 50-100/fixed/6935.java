@java.lang.Override
public com.drmattyg.nanokaraoke.TrackEvent next() {
    com.drmattyg.nanokaraoke.TrackEvent evt = com.drmattyg.nanokaraoke.TrackEvent.getInstance(tc, iteratorOffset);
    if (evt.hasStatusbyte()) {
        setLastStatusByte(evt.getStatusByte());
    }else {
        evt.setStatusByte(((getLastStatusByte()) & 255));
    }
    iteratorOffset += evt.getTotalLength();
    return evt;
}