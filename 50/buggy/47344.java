@java.lang.Override
protected void write(java.nio.ByteBuffer data, org.reactivestreams.Subscriber<?> onComplete, boolean flush) {
    body.append(data);
    if (flush) {
        write(1, null, true);
    }
}