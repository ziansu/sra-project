void hide(boolean animate) {
    if (!(isHidden())) {
        if (animate) {
            playHideAnimation();
        }
        com.wanderingcan.widget.LabelView.mHandler.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                setVisibility(com.wanderingcan.widget.INVISIBLE);
            }
        }, (animate ? mHideAnimation.getDuration() : 0));
    }
}