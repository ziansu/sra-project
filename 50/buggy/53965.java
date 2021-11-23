boolean disableQuietWhenAnyDebugModeEnabled() {
    return ((!(isMavenDebugOutputEnabled())) && (!(isSurefireRemoteDebuggingEnabled()))) && (!(isRemoteDebugEnabled()));
}