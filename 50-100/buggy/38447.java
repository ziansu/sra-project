@com.facebook.react.bridge.ReactMethod
public void requestPermission(final java.lang.String permissionString, java.lang.String nullForiOSCompat, final com.facebook.react.bridge.Promise promise) {
    java.lang.String permission = permissionForString(permissionString);
    com.facebook.react.bridge.Callback resolve = new com.facebook.react.bridge.Callback() {
        @java.lang.Override
        public void invoke(java.lang.Object... args) {
            getPermissionStatus(permissionString, promise);
        }
    };
    com.facebook.react.bridge.Callback reject = new com.facebook.react.bridge.Callback() {
        @java.lang.Override
        public void invoke(java.lang.Object... args) {
        }
    };
    mPermissionsModule.requestPermission(permission, new com.facebook.react.bridge.PromiseImpl(resolve, reject));
}