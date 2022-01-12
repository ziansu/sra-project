@java.lang.Override
public void onEvent() {
    if ((isBall()) != true) {
        setState(com.example.iuas.CatchBall.STATE.CATCH_BALL);
        setBall(true);
        if ((RobotControl.robotControlThread) != null)
            RobotControl.robotControlThread.interrupt();
        
    }
}