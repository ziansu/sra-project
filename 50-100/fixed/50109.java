public void updateSettings() {
    android.content.ContentResolver resolver = mContext.getContentResolver();
    mShowCombinedVolumes = (Settings.System.getInt(resolver, Settings.System.ENABLE_VOLUME_OPTIONS, 0)) == 1;
    if (!(mShowCombinedVolumes)) {
        mMoreButton.setVisibility(View.GONE);
        mDivider.setVisibility(View.GONE);
    }else {
        mMoreButton.setOnClickListener(this);
    }
}