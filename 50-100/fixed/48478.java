@java.lang.Override
public boolean onLongClick(android.view.View v) {
    final java.lang.String pkg = source.componentName.getPackageName();
    if (android.text.TextUtils.equals(pkg, getContext().getPackageName())) {
        return false;
    }
    try {
        startActivity(new android.content.Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS, android.net.Uri.fromParts("package", pkg, null)));
    } catch (final android.content.ActivityNotFoundException e) {
        return false;
    }
    return true;
}