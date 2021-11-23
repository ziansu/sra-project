@java.lang.Override
public void run() {
    long diff = (java.lang.System.currentTimeMillis()) - (this.video_start_millis);
    long seconds = ((hdEnabled ? com.gcw.sapienza.places.activities.VideoCaptureActivity.MAX_VIDEO_LENGTH_HD : com.gcw.sapienza.places.activities.VideoCaptureActivity.MAX_VIDEO_LENGTH) - diff) / 1000;
    this.timeTextView.setText(java.lang.Long.toString(seconds));
}