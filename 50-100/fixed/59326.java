@java.lang.Override
public void finish() {
    if ((mGeckoView) != null) {
        mGeckoView.loadUri("about:blank");
    }
    super.finish();
    final org.mozilla.gecko.mozglue.SafeIntent intent = new org.mozilla.gecko.mozglue.SafeIntent(getIntent());
    if (org.mozilla.gecko.customtabs.IntentUtil.hasExitAnimation(intent)) {
        usingCustomAnimation = true;
        overridePendingTransition(org.mozilla.gecko.customtabs.IntentUtil.getEnterAnimationRes(intent), org.mozilla.gecko.customtabs.IntentUtil.getExitAnimationRes(intent));
        usingCustomAnimation = false;
    }
}