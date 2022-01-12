@java.lang.Override
public void onShow() {
    activity.mode = vn.mbm.phimp.me.editor.editimage.EditImageActivity.MODE_TUNE;
    currentSource = activity.mTuneListFragment.getCurrentBitmap();
    activity.mainImage.setImageBitmap(activity.mTuneListFragment.getCurrentBitmap());
    activity.mainImage.setDisplayType(ImageViewTouchBase.DisplayType.FIT_TO_SCREEN);
    activity.mainImage.setScaleEnabled(false);
    activity.bannerFlipper.setVisibility(View.VISIBLE);
    activity.bannerFlipper.showNext();
    mSeekBar.setProgress(50);
    switch (TuneListFragment.MODE) {
        case TuneListFragment.HUE :
        case TuneListFragment.BLUR :
        case TuneListFragment.VIGNETTE :
        case TuneListFragment.SHARPNESS :
            mSeekBar.setProgress(0);
            break;
    }
}