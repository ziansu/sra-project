@java.lang.Override
public void gestureCallBack(int event, com.ds.avare.touch.LongTouchDestination data) {
    if ((com.ds.avare.touch.GestureInterface.TOUCH) == event) {
        hideMenu();
    }
    if ((com.ds.avare.touch.GestureInterface.LONG_PRESS) == event) {
        if ((mInfc) != null) {
            mInfc.setData(data);
        }
        mAlertDialogDestination.show();
        mAirportPressed = data.airport;
    }
}