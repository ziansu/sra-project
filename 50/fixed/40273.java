@java.lang.Override
public void run() {
    cc.openframeworks.OFAndroid.disableTouchEvents();
    cc.openframeworks.OFAndroid.disableOrientationChangeEvents();
    synchronized(OFAndroidObject.ofObjects) {
        for (cc.openframeworks.OFAndroidObject object : OFAndroidObject.ofObjects) {
            object.onPause();
        }
    }
}