@java.lang.Override
public void onStop() {
    super.onStop();
    android.view.animation.Animation animation = android.view.animation.AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out);
    relativeLayout.startAnimation(animation);
}