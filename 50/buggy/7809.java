@java.lang.Override
public void detachView() {
    mView = null;
    if (!(subscription.isUnsubscribed())) {
        subscription.unsubscribe();
    }
}