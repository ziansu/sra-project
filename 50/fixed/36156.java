@java.lang.Override
public void run() {
    cc.openframeworks.OFAndroid.enableTouchEvents();
    cc.openframeworks.OFAndroid.enableOrientationChangeEvents();
    synchronized(OFAndroidObject.ofObjects) {
        for (cc.openframeworks.OFAndroidObject object : OFAndroidObject.ofObjects) {
            object.onResume();
        }
    }
}