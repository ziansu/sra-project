@java.lang.Override
public void close() {
    if ((channel) != null) {
        channel.close();
        channel = null;
    }
}