public void unsub() {
    if (((mSub) != null) && (!(mSub.isUnsubscribed()))) {
        mSub.unsubscribe();
    }
    if (((mRealm) != null) && (!(mRealm.isClosed()))) {
        mRealm.close();
    }
}