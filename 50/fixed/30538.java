@java.lang.Override
public boolean ack() {
    return store.remove(currentMessageIndex);
}