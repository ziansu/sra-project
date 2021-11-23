@java.lang.Override
public void run() {
    mMeter.meter_settings.target_meter_state = mMeter.METER_RUNNING;
    mMeter.sendMeterSettings(new com.mooshim.mooshimeter.common.Block() {
        @java.lang.Override
        public void run() {
            android.util.Log.i(null, "Mode set");
        }
    });
    android.util.Log.i(null, "Stream requested");
}