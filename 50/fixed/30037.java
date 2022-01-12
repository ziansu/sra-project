@java.lang.Override
public void error(java.lang.Throwable err) {
    if (err != null) {
        tinkermode.com.myapplication.utils.MiscUtils.showAlert(context, getClass(), err);
    }else {
        logger.d(("Query event triggered: deviceId: " + (device.deviceId)));
    }
}