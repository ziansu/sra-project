@java.lang.Override
public java.util.List<com.facebook.react.bridge.NativeModule> createNativeModules(com.facebook.react.bridge.ReactApplicationContext reactApplicationContext) {
    sendSms = new com.tkporter.sendsms.SendSMSModule(reactApplicationContext);
    if ((com.tkporter.sendsms.SendSMSPackage.instance) == null) {
        com.tkporter.sendsms.SendSMSPackage.instance = this;
    }
    return java.util.Arrays.<com.facebook.react.bridge.NativeModule>asList(sendSms);
}