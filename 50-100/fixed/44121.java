@java.lang.Override
public void run() {
    if (now == (lastTouchTime)) {
        switch (touchCount.get()) {
            case 1 :
                if (!(isLongPressUp)) {
                    isLongPressUp = true;
                }else {
                    if ((mFloatEventCallback) != null) {
                        mFloatEventCallback.onClick();
                    }
                }
                break;
            case 2 :
                if ((mFloatEventCallback) != null) {
                    mFloatEventCallback.onDoubleClick();
                }
                break;
        }
        touchCount.set(0);
    }
}