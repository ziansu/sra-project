public void broadcastStepDetected(long timestamp, float[] values) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(Constants.KEY.ACCELEROMETER_PEAK_TIMESTAMP, timestamp);
    intent.putExtra(Constants.KEY.ACCELEROMETER_PEAK_VALUE, values);
    intent.setAction(Constants.ACTION.BROADCAST_ACCELEROMETER_PEAK);
    android.support.v4.content.LocalBroadcastManager manager = android.support.v4.content.LocalBroadcastManager.getInstance(this);
    manager.sendBroadcast(intent);
}