private void startContentAnimation() {
    btnCreate.animate().translationY(0).setInterpolator(new android.view.animation.OvershootInterpolator(1.0F)).setStartDelay(300).setDuration(com.rolling.ten_thousand_hours.instamaterial.activity.MainActivity.ANIM_DURATION_FAB).start();
    feedAdapter.updateItems(false);
}