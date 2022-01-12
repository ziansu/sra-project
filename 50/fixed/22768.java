private boolean isJailBroken() {
    return ((containsTestKeys()) || (isSuperuserPresent())) || (com.gantix.JailMonkey.JailMonkeyModule.canExecuteCommand("/system/xbin/which su"));
}