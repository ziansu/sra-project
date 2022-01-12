public void unsub() {
    if ((mRealm) != null) {
        if (((mSub) != null) && (!(mSub.isUnsubscribed()))) {
            mSub.unsubscribe();
        }
        mRealm.close();
        mRealm = null;
    }
}