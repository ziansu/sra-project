@java.lang.Override
public void put(final java.lang.Object key, net.openhft.chronicle.network.connection.WriteMarshallable event) {
    assert java.lang.Thread.holdsLock(this);
    synchronized(this) {
        event.writeMarshallable(wire);
    }
}