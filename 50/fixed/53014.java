@java.lang.Override
public void close() {
    if (null != (client)) {
        client.close();
        client = null;
    }
}