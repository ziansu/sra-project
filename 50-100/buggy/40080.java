private void runEnterAnimation(android.view.View view, int position) {
    if (position >= ((net.hadifar.dope.ui.adapter.BaseAdapter.ANIMATED_ITEMS_COUNT) - 1)) {
        return ;
    }
    if (position > (lastAnimatedPosition)) {
        lastAnimatedPosition = position;
        view.setTranslationY(net.hadifar.dope.utils.Utils.getScreenHeight(mContext));
        view.animate().translationY(0).setInterpolator(new android.view.animation.DecelerateInterpolator(3.0F)).setDuration(700).setStartDelay(500).start();
    }
}