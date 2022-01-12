void clearConnection() {
    mWasOomProtected = mConnection.isOomProtectedOrWasWhenDied();
    org.chromium.content.browser.BindingManagerImpl.ModerateBindingPool moderateBindingPool = mModerateBindingPool;
    if (moderateBindingPool != null)
        moderateBindingPool.removeConnection(this);
    
    mConnection = null;
}