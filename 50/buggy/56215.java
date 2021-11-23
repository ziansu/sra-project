@java.lang.Override
protected com.react_native_signature.RCTSigntureView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    this.mContext = reactContext;
    return new com.react_native_signature.RCTSigntureView(reactContext);
}