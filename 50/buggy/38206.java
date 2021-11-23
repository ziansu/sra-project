@java.lang.Override
public synchronized void receive(distributed.schiperegglisandoz.Message m) {
    messageBuffer.add(m);
    checkDeliveries();
}