@java.lang.Override
public void onClick(android.view.View v) {
    updateCurrentActivity();
    if ((v.getId()) == (R.id.action)) {
        mBeating = mListener.toggleHeartRateMonitor();
        if (mBeating) {
            mTitle.setText(R.string.heart_rate_monitor_title_setup);
            mBpm.setText(R.string.heart_rate_monitor_empty_heart_beat);
            mAction.setText(R.string.heart_rate_monitor_action_stop);
            setMeasuringVisibility();
        }
    }
}