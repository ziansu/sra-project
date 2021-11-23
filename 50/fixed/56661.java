@android.support.annotation.CallSuper
@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((adView) != null) {
        adView.destroy(isChangingConfigurations());
    }
}