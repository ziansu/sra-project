private void requestMoreAfterEmission(int emitted) {
    rx.internal.operators.OperatorPublish.OriginSubscriber<T> origin = state.getOrigin();
    if ((emitted > 0) && (origin != null)) {
        long r = origin.originOutstanding.addAndGet((-emitted));
        if (r <= (origin.THRESHOLD)) {
            origin.requestMore(((rx.internal.util.RxRingBuffer.SIZE) - (origin.THRESHOLD)));
        }
    }
}