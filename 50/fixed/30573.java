public void screenTapGestureRecognized(com.leapmotion.leap.ScreenTapGesture gesture) {
    if ((gesture.state()) == (com.leapmotion.leap.Gesture.State.STATE_STOP)) {
        if ((timePassed) > 10) {
            mousePressed();
            timePassed = 0;
        }
    }
}