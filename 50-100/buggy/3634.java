@java.lang.Override
public java.util.List<com.facebook.react.bridge.NativeModule> createNativeModules(com.facebook.react.bridge.ReactApplicationContext reactContext) {
    java.util.List<com.facebook.react.bridge.NativeModule> modules = new java.util.ArrayList<>();
    com.homypiandroid.SocketConnection sC = new com.homypiandroid.SocketConnection(reactContext, mActivity);
    modules.add(sC);
    modules.add(new com.homypiandroid.ToastModuleBis(reactContext, mActivity, sC));
    return modules;
}