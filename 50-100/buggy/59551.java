private int handleOrientation() {
    final int o = this.getResources().getConfiguration().orientation;
    switch (o) {
        case android.content.res.Configuration.ORIENTATION_LANDSCAPE :
            if (!(trend_view_running)) {
                android.util.Log.i(com.mooshim.mooshimeter.main.DeviceActivity.TAG, "Starting trend view.");
                trend_view_running = true;
                mMeter.pauseStream(null);
                mMeter.addToRunQueue(new java.lang.Runnable() {
                    @java.lang.Override
                    public void run() {
                        startTrendActivity();
                    }
                });
            }
            break;
        case android.content.res.Configuration.ORIENTATION_PORTRAIT :
            break;
    }
    return o;
}