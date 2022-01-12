@java.lang.Override
public void onTimePassed(org.andengine.engine.handler.timer.TimerHandler pTimerHandler) {
    numCount = 0;
    for (int ctr = 0; ctr < (object1.length); ctr++) {
        object1[ctr].unregisterUpdateHandler(pTimerHandler);
        object1[ctr].setScale(1.0F);
        registerTouchArea(object1[ctr]);
    }
}