@java.lang.Override
public void onProgressChanged(com.jaguarlandrover.hvacdemo.SeekBar seekBar, int progress, boolean fromUser) {
    android.util.Log.d(com.jaguarlandrover.hvacdemo.MainActivity.TAG, com.jaguarlandrover.hvacdemo.Util.getMethodName());
    com.jaguarlandrover.hvacdemo.HVACManager.updateService(((java.lang.String) (mControlToServices.get(seekBar.getId()))), java.lang.Integer.toString(progress));
}