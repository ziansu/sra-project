public org.tuntuni.video.DialStatus getStatus() {
    synchronized(mStatus) {
        return mStatus.get();
    }
}