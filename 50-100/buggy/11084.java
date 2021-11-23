@java.lang.Override
public void onNavigationEvent(int navigationEvent, android.os.Bundle extras) {
    super.onNavigationEvent(navigationEvent, extras);
    if (navigationEvent == (NAVIGATION_FINISHED)) {
        android.support.customtabs.CustomTabsIntent.Builder builder = new android.support.customtabs.CustomTabsIntent.Builder(session);
        builder.setToolbarColor(android.support.v4.content.ContextCompat.getColor(activity, R.color.accent));
        android.support.customtabs.CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(activity, android.net.Uri.parse(urls[((index)++)]));
    }
}