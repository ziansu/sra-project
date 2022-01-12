@java.lang.Override
public void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
    if (call.method.equals("check")) {
        android.net.NetworkInfo info = manager.getActiveNetworkInfo();
        if ((info != null) && (info.isConnected())) {
            result.success(io.flutter.plugins.connectivity.ConnectivityPlugin.getNetworkType(info.getType()));
        }
        result.success("none");
    }else {
        result.notImplemented();
    }
}