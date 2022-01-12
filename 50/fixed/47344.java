@java.lang.Override
protected void write(java.nio.ByteBuffer data, org.reactivestreams.Subscriber<?> onComplete, boolean flush) {
    body.append(data);
    if (flush) {
        write(((java.lang.Object) (null)), null, true);
    }
}