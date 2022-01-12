private void requestMoreAfterEmission(int emitted) {
    if (emitted > 0) {
        rx.internal.operators.OperatorPublish.OriginSubscriber<T> origin = state.getOrigin();
        if (origin != null) {
            long r = origin.originOutstanding.addAndGet((-emitted));
            if (r <= (origin.THRESHOLD)) {
                origin.requestMore(((rx.internal.util.RxRingBuffer.SIZE) - (origin.THRESHOLD)));
            }
        }
    }
}