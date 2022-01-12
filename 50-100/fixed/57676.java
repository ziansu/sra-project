public static void enableProfile(android.content.Context context) {
    com.afwsamples.testdpc.FirstAccountReadyBroadcastReceiver.cancelFirstAccountReadyTimeoutAlarm(context);
    android.app.admin.DevicePolicyManager manager = ((android.app.admin.DevicePolicyManager) (context.getSystemService(Context.DEVICE_POLICY_SERVICE)));
    android.content.ComponentName componentName = com.afwsamples.testdpc.DeviceAdminReceiver.getComponentName(context);
    manager.setProfileName(componentName, context.getString(R.string.profile_name));
    manager.setProfileEnabled(componentName);
}