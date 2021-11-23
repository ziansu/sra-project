public android.app.Activity getPreActivity() {
    int size = com.hitomi.aslibrary.ActivityManager.activityStack.size();
    if (size < 2)
        return null;
    
    return com.hitomi.aslibrary.ActivityManager.activityStack.elementAt((size - 2));
}