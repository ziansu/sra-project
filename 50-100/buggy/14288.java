@java.lang.Override
public void close(com.hazelcast.spi.EventRegistration eventRegistration) {
    com.hazelcast.spi.impl.eventservice.impl.Registration registration = ((com.hazelcast.spi.impl.eventservice.impl.Registration) (eventRegistration));
    if (!((registration.getListener()) instanceof java.io.Closeable)) {
        return ;
    }
    try {
        ((java.io.Closeable) (eventRegistration)).close();
    } catch (java.io.IOException e) {
        com.hazelcast.util.EmptyStatement.ignore(e);
    }
}