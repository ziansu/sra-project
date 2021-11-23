public static int getTag() {
    int result = com.catfish.zposed.HookManager.sTag.get();
    if (result <= 0) {
        result = com.catfish.zposed.HookManager.sHookPtr;
    }
    com.catfish.zposed.HookManager.sTag.set(com.catfish.zposed.HookManager.sHookPtr);
    return result;
}