@java.lang.Override
public java.util.List<com.facebook.react.bridge.NativeModule> createNativeModules(com.facebook.react.bridge.ReactApplicationContext reactContext) {
    java.util.List<com.facebook.react.bridge.NativeModule> modules = new java.util.ArrayList<>();
    modules.add(new com.homypiandroid.SocketConnection(reactContext, mActivity));
    modules.add(new com.homypiandroid.ToastModuleBis(reactContext, mActivity));
    return modules;
}