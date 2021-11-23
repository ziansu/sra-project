@com.squareup.otto.Subscribe
public void bandwidthResultListener(com.networkmonitor.Events.BandwidthResult bandwidthResult) {
    if ((bandwidthResult.speed) == null) {
        return ;
    }
    if (shouldUpload()) {
        mBandwidthNode.push().setValue(new com.networkmonitor.firebase.FirebaseBandwidthObject(mAnonId, bandwidthResult.speed, mLastPingResult.rssiLevel, mLastLocation.getLatitude(), mLastLocation.getLongitude()));
    }
}