public boolean hideQuickReply(boolean clearReplyTo) {
    if (net.jejer.hipda.bean.HiSettingsHelper.getInstance().isGestureBack())
        ((net.jejer.hipda.ui.ThreadDetailActivity) (getActivity())).setSwipeBackEnable(true);
    
    if (clearReplyTo) {
        deHighlightPostId();
        mQuickReplyMode = net.jejer.hipda.async.PostHelper.MODE_REPLY_THREAD;
        mQuickReplyToPost = null;
    }
    if ((mQuickReply.getVisibility()) == (android.view.View.VISIBLE)) {
        mQuickReply.setVisibility(View.INVISIBLE);
        mMainFab.show();
        return true;
    }
    return false;
}