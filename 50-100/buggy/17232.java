private void init() {
    int width = getContext().getResources().getDisplayMetrics().widthPixels;
    mTextEnv = new com.hyena.coretext.TextEnv(getContext()).setPageWidth(width).setTextColor(-13421773).setFontSize(com.hyena.framework.utils.UIUtils.dip2px(20)).setTextAlign(TextEnv.Align.CENTER).setPageHeight(java.lang.Integer.MAX_VALUE).setVerticalSpacing(com.hyena.framework.utils.UIUtils.dip2px(getContext(), 3));
    mTextEnv.getEventDispatcher().addLayoutEventListener(this);
}