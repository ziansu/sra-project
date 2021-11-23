@java.lang.Override
public java.util.List<com.facebook.react.bridge.NativeModule> createNativeModules(com.facebook.react.bridge.ReactApplicationContext reactContext) {
    java.util.List<com.facebook.react.bridge.NativeModule> viewManagers = new java.util.ArrayList<>();
    viewManagers.add(new com.demo2.ToastModule(reactContext));
    return java.util.Collections.emptyList();
}