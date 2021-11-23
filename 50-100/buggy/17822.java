@java.lang.Override
public void onClick(android.view.View v) {
    mScreenOrientation = getResources().getConfiguration().orientation;
    mClick = true;
    if ((!(mIsLand)) && (mPlaying)) {
        changeToLandscape();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        mIsLand = true;
        mClickLand = false;
    }else {
        changeToPortRait();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mIsLand = false;
        mClickPort = false;
    }
}