public static java.lang.String getSDKLocation() throws org.eclipse.core.runtime.CoreException {
    java.lang.String sdkLocation = org.eclipse.core.runtime.Platform.getPreferencesService().getString(org.eclipse.thym.wp.core.WPCore.THYM_UI_ID, WPConstants.WINDOWS_PHONE_SDK_LOCATION_PREF, null, null);
    if (sdkLocation == null) {
        java.io.File location = org.eclipse.thym.wp.core.WPCore.detectSDK();
        if (location.exists()) {
            sdkLocation = location.getAbsolutePath();
            org.eclipse.core.runtime.preferences.IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(org.eclipse.thym.wp.core.WPCore.THYM_UI_ID);
            prefs.put(WPConstants.WINDOWS_PHONE_SDK_LOCATION_PREF, sdkLocation);
        }
    }
    return sdkLocation;
}