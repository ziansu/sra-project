private void runEnterAnimation(android.view.View view, int position) {
    if (position > (lastAnimatedPosition)) {
        lastAnimatedPosition = position;
        view.setTranslationY(net.hadifar.dope.utils.Utils.getScreenHeight(mContext));
        view.animate().translationY(0).setInterpolator(new android.view.animation.DecelerateInterpolator(3.0F)).setDuration(700).setStartDelay(500).start();
    }
}