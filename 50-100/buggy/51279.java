@java.lang.Override
public void run() {
    java.lang.String carrier = io.puremetrics.sdk.Utils.getCarrierName(appContext);
    if (!(android.text.TextUtils.isEmpty(carrier))) {
        io.puremetrics.sdk.PureMetrics.trackDeviceProperties(Constants.DA_CARRIER, carrier);
    }
    io.puremetrics.sdk.PureMetrics.trackDeviceProperties(Constants.DA_MAKE, Build.MANUFACTURER);
    io.puremetrics.sdk.PureMetrics.trackDeviceProperties(Constants.DA_MODEL, Build.MODEL);
    io.puremetrics.sdk.PureMetrics.trackDeviceProperties(Constants.DA_OS_VERSION, Build.VERSION.SDK_INT);
    io.puremetrics.sdk.PureMetrics.trackDeviceProperties(Constants.ATTR_PL, Constants.PLATFORM_ANDROID);
    io.puremetrics.sdk.Utils.trackAdvertisementIdIfPossible(io.puremetrics.sdk.PureMetrics._INSTANCE.appContext);
}