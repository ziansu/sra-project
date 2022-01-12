@java.lang.Override
public void onClick(android.view.View v) {
    mScreenOrientation = getResources().getConfiguration().orientation;
    mClick = true;
    if ((!(mIsLand)) && (mPlaying)) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        changeToLandscape();
        mIsLand = true;
        mClickLand = false;
    }else {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        changeToPortRait();
        mIsLand = false;
        mClickPort = false;
    }
}