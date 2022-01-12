private void changeToLandscape() {
    mFullScreen.setImageResource(R.drawable.icon_quit_fullscreen);
    mToolBar.setVisibility(View.GONE);
    mTabHost.setVisibility(View.GONE);
    mViewPager.setVisibility(View.GONE);
    mFloatButton.setVisibility(View.GONE);
    mGoBackButton.setVisibility(View.VISIBLE);
    mCurTime.setVisibility(View.VISIBLE);
    mChanelList.setVisibility(View.VISIBLE);
    mScreenOrientation = android.content.res.Configuration.ORIENTATION_LANDSCAPE;
    com.eardatek.player.dtvplayer.util.WindowUtil.fullScreen(true, this);
    updateChanelList();
    setSurfaceLayout(mVideoWidth, mVideoHeight, mVideoVisibleWidth, mVideoVisibleHeight, mSarNum, mSarDen);
}