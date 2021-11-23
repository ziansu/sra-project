@java.lang.Override
public void unbind() {
    mView = null;
    if (((mRxSubscription) != null) && (!(mRxSubscription.isUnsubscribed()))) {
        mRxSubscription.unsubscribe();
    }
}