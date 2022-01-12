boolean disableQuietWhenAnyDebugModeEnabled() {
    return (!(isSurefireRemoteDebuggingEnabled())) && (!(isRemoteDebugEnabled()));
}