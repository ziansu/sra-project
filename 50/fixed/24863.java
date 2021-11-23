public static com.hitomi.aslibrary.ActivityManager getInstance() {
    if ((com.hitomi.aslibrary.ActivityManager.activityStack) == null) {
        com.hitomi.aslibrary.ActivityManager.activityStack = new java.util.Stack<>();
    }
    return com.hitomi.aslibrary.ActivityManager.SingletonHolder.instance;
}