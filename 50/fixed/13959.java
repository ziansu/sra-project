@java.lang.Override
public void put(final java.lang.Object key, net.openhft.chronicle.network.connection.WriteMarshallable event) {
    synchronized(this) {
        event.writeMarshallable(wire);
    }
}