private void setAppLabelAndIcon(android.content.pm.PackageInfo pkgInfo) {
    final android.view.View appSnippet = mRootView.findViewById(R.id.app_snippet);
    java.lang.CharSequence label = mPm.getApplicationLabel(pkgInfo.applicationInfo);
    android.graphics.drawable.Drawable icon = mPm.getApplicationIcon(pkgInfo.applicationInfo);
    com.android.settings.applications.InstalledAppDetails.setupAppSnippet(appSnippet, label, icon, (pkgInfo != null ? pkgInfo.versionName : null), null);
}