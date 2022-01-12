@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    action = intent.getAction();
    if (Intent.ACTION_SCREEN_ON.equals(action)) {
        mScreenStateListener.onScreenOn();
    }else
        if (Intent.ACTION_SCREEN_OFF.equals(action)) {
            mScreenStateListener.onScreenOff();
        }else
            if (Intent.ACTION_USER_PRESENT.equals(action)) {
                mScreenStateListener.onUserPresent();
            }else {
            }
        
    
}