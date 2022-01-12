@java.lang.Override
public void run() {
    current_time.setText(java.lang.String.valueOf((hrs + " :")));
    current_time_min.setText(java.lang.String.valueOf((min + " :")));
    current_time_sec.setText(java.lang.String.valueOf(sec));
    mLastUpdateTime = java.lang.String.valueOf((hrs + ":"));
    mLastUpdateTime.concat(java.lang.String.valueOf((min + " :")));
    mLastUpdateTime.concat(java.lang.String.valueOf(sec));
}