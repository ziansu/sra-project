@org.greenrobot.eventbus.Subscribe
public void onEvent(com.fan.gazeshutter.event.GazeEvent ge) {
    com.fan.gazeshutter.MainApplication mMainApplicaiton = com.fan.gazeshutter.MainApplication.getInstance();
    int x = ((int) ((ge.x) * (mMainApplicaiton.mScreenWidth)));
    int y = ((int) ((ge.x) * (mMainApplicaiton.mScreenHeight)));
    mCurrentTrail.update(x, y);
}