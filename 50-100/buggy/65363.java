@java.lang.Override
protected void createFieldEditors() {
    enabledEditor = new org.eclipse.jface.preference.BooleanFieldEditor(Constants.PREF_NEWS_ENABLED, org.eclipse.recommenders.internal.news.rcp.l10n.Messages.FIELD_LABEL_NEWS_ENABLED, getFieldEditorParent());
    addField(enabledEditor);
    pollingIntervalEditor = new org.eclipse.jface.preference.IntegerFieldEditor(Constants.PREF_POLLING_INTERVAL, org.eclipse.recommenders.internal.news.rcp.l10n.Messages.FIELD_LABEL_POLLING_INTERVAL, getFieldEditorParent(), 4);
    addField(pollingIntervalEditor);
    feedEditor = new org.eclipse.recommenders.internal.news.rcp.NewsFeedPreferencePage.FeedEditor(Constants.PREF_FEED_LIST_SORTED, org.eclipse.recommenders.internal.news.rcp.l10n.Messages.FIELD_LABEL_FEEDS, getFieldEditorParent());
    addField(feedEditor);
}