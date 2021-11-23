public void startGitHubProjectCustomTab() {
    android.support.customtabs.CustomTabsIntent customTabsIntent = getDefaultCustomTabsIntentBuilder().setStartAnimations(this, R.anim.slide_in_right, R.anim.slide_out_left).setExitAnimations(this, R.anim.slide_in_left, R.anim.slide_out_right).build();
    saschpe.android.customtabs.CustomTabsHelper.addKeepAliveExtra(this, customTabsIntent.intent);
    saschpe.android.customtabs.CustomTabsHelper.openCustomTab(this, customTabsIntent, android.net.Uri.parse(com.example.saschpe.customtabs.activity.MainActivity.GITHUB_PAGE), new saschpe.android.customtabs.WebViewFallback());
}