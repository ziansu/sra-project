public void onTagSelected(java.lang.String tag) {
    final android.content.Intent shortcutIntent = com.pindroid.action.IntentHelper.ViewBookmarks(tag, username, this);
    final android.content.Intent.ShortcutIconResource iconResource = Intent.ShortcutIconResource.fromContext(this, R.drawable.ic_shortcut);
    final android.content.Intent intent = new android.content.Intent();
    intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
    intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, tag);
    intent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, iconResource);
    setResult(com.pindroid.activity.RESULT_OK, intent);
    finish();
}