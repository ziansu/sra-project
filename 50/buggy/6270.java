private void dropCurrentConnection() {
    if ((mCurrentConnectionRef) != null) {
        mCurrentConnectionRef.removeValue();
        mCurrentLastOnlineRef.setValue(ServerValue.TIMESTAMP);
    }
}