public static com.hitomi.aslibrary.ActivityManager getInstance() {
    com.hitomi.aslibrary.ActivityManager.activityStack = new java.util.Stack<>();
    return com.hitomi.aslibrary.ActivityManager.SingletonHolder.instance;
}