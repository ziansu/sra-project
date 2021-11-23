@java.lang.Override
protected void onStop() {
    super.onStop();
    if (isDualPane()) {
        mPublishSubject.onComplete();
    }
}