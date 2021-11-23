@java.lang.Override
public void onSubscribe(io.reactivex.internal.operators.Subscription s) {
    if (parent.setSubscription(s, index)) {
        this.s = s;
        s.request(bufferSize);
    }
}