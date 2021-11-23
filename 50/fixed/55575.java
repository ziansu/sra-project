public void openChromeTab(java.lang.String url) {
    intentBuilder.addMenuItem("Share", createPendingShareIntent(url));
    com.hitherejoe.tabby.CustomTabActivityHelper.openCustomTab(activity, intentBuilder.build(), android.net.Uri.parse(url), getCustomTabFallback());
}