private void init(android.content.Context context) {
    this.context = context;
    if (de.christinecoenen.code.zapp.utils.ShortcutHelper.areShortcutsSupported()) {
        loadChannelList();
        setSummaryToSelectedChannels();
    }
}