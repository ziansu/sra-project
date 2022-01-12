private void setAppLabelAndIcon(android.content.pm.PackageInfo pkgInfo) {
    final android.view.View appSnippet = mHeader.findViewById(R.id.app_snippet);
    mState.ensureIcon(mAppEntry);
    com.android.settings.applications.InstalledAppDetails.setupAppSnippet(appSnippet, mAppEntry.label, mAppEntry.icon, (pkgInfo != null ? pkgInfo.versionName : null), pkgInfo.packageName);
}