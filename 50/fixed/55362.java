void emitterOnCompleted() {
    mIsConnected = false;
    if ((mEmitter) != null) {
        mEmitter.onCompleted();
    }
}