@java.lang.Override
public void onSubscribe(io.reactivex.internal.operators.Subscription s) {
    if (parent.setSubscription(s, index)) {
        s.request(bufferSize);
    }
}