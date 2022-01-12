public void onCreate() {
    super.onCreate();
    android.preference.PreferenceManager.setDefaultValues(this, R.xml.preference, false);
    itemProvider = new li.zeitgeist.android.provider.ItemProvider(getApi());
    thumbnailProvider = new li.zeitgeist.android.provider.ThumbnailProvider(this, getApi());
    itemProvider.addUpdatedItemsListener(thumbnailProvider);
}