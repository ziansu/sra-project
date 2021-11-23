@org.robolectric.annotation.Implementation
public void __constructor__(boolean quitAllowed) {
    invokeConstructor(android.os.Looper.class, realObject, org.robolectric.util.ReflectionHelpers.ClassParameter.from(boolean.class, quitAllowed));
    if (org.robolectric.RuntimeEnvironment.isMainThread()) {
        org.robolectric.shadows.ShadowLooper.mainLooper = realObject;
    }else {
        synchronized(android.os.Looper.class) {
            org.robolectric.shadows.ShadowLooper.loopingLoopers.put(java.lang.Thread.currentThread(), realObject);
        }
    }
    resetScheduler();
}