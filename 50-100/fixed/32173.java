@com.squareup.otto.Subscribe
public void bandwidthResultListener(com.networkmonitor.Events.BandwidthResult bandwidthResult) {
    if (shouldUpload()) {
        mBandwidthNode.push().setValue(new com.networkmonitor.firebase.FirebaseBandwidthObject(mAnonId, ((bandwidthResult.speed) == null ? -1.0 : bandwidthResult.speed), mLastPingResult.rssiLevel, mLastLocation.getLatitude(), mLastLocation.getLongitude()));
    }
}