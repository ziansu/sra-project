@java.lang.Override
public void execute() throws java.lang.Exception {
    com.adguard.android.service.FilterService filterService = com.adguard.android.ServiceLocator.getInstance(context).getFilterService();
    com.adguard.android.service.PreferencesService preferencesService = com.adguard.android.ServiceLocator.getInstance(context).getPreferencesService();
    java.util.List<com.adguard.android.model.FilterList> filterLists = filterService.checkFilterUpdates(false);
    if (!(org.apache.commons.collections4.CollectionUtils.isEmpty(filterLists))) {
        preferencesService.setLastUpdateCheck(java.lang.System.currentTimeMillis());
        filterService.applyNewSettings();
    }
}