@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB_MR1)
@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    super.onAnimationEnd(animation);
    try {
        android.view.View infoBlock = mWrapperView.findViewById(R.id.lock_screen_info_block);
        infoBlock.setVisibility(View.INVISIBLE);
    } catch (java.lang.NullPointerException e) {
        android.util.Log.e(com.vitaminbacon.lockscreendialer.LockScreenActivity.TAG, "Layout lacks necessary view to complete animation", e);
        onFatalError();
    }
}