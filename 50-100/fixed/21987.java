@java.lang.Override
public void onLongPress() {
    if ((mClickHandler) == null) {
        mClickHandler = new acr.browser.lightning.ClickHandler(mContext);
    }
    android.os.Message click = mClickHandler.obtainMessage();
    if (click != null) {
        click.setTarget(mClickHandler);
        mCurrentView.getWebView().requestFocusNodeHref(click);
    }
}