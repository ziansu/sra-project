@java.lang.Override
public boolean isOpen() {
    return (channel1.isOpen()) && (channel2.isOpen());
}