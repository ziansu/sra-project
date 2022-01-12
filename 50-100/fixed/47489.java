public com.auth0.android.lock.Lock.Builder withAuthenticationParameters(@android.support.annotation.NonNull
java.util.Map<java.lang.String, java.lang.Object> authenticationParameters) {
    if (authenticationParameters instanceof java.util.HashMap) {
        options.setAuthenticationParameters(new java.util.HashMap<>(authenticationParameters));
    }else {
        options.setAuthenticationParameters(new java.util.HashMap<>(authenticationParameters));
    }
    return this;
}