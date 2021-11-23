protected void updateColors() {
    final android.content.ContentResolver resolver = mContext.getContentResolver();
    mLabelColor = Settings.System.getInt(resolver, Settings.System.QS_TEXT_COLOR, -1);
    mIconColor = Settings.System.getInt(resolver, Settings.System.QS_ICON_COLOR, -1);
}