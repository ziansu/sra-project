public java.lang.String getSecureViewId(android.view.View view) {
    if ((getViewId(view)) == null)
        return null;
    
    if (com.aimbrain.sdk.privacy.SensitiveViewGuard.isViewSensitive(view))
        return com.aimbrain.sdk.privacy.SensitiveViewGuard.calculateHash(((getViewId(view)) + (com.aimbrain.sdk.privacy.SensitiveViewGuard.getSalt())));
    
    return getViewId(view);
}