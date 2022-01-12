@java.lang.Override
public void onAttach(android.app.Activity activity) {
    android.os.Bundle args = getArguments();
    mRadius = args.getInt(fr.tvbarthel.lib.blurdialogfragment.sample.SampleSupportDialogFragment.BUNDLE_KEY_BLUR_RADIUS);
    mDownScaleFactor = args.getFloat(fr.tvbarthel.lib.blurdialogfragment.sample.SampleSupportDialogFragment.BUNDLE_KEY_DOWN_SCALE_FACTOR);
    mDimming = args.getBoolean(fr.tvbarthel.lib.blurdialogfragment.sample.SampleSupportDialogFragment.BUNDLE_KEY_DIMMING);
    mDebug = args.getBoolean(fr.tvbarthel.lib.blurdialogfragment.sample.SampleSupportDialogFragment.BUNDLE_KEY_DEBUG);
    mBlurredActionBar = args.getBoolean(fr.tvbarthel.lib.blurdialogfragment.sample.SampleSupportDialogFragment.BUNDLE_KEY_BLURRED_ACTION_BAR);
    mUseRenderScript = args.getBoolean(fr.tvbarthel.lib.blurdialogfragment.sample.SampleSupportDialogFragment.BUNDLE_KEY_USE_RENDERSCRIPT);
    super.onAttach(activity);
}