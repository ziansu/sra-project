@java.lang.Override
public void execute() throws java.lang.Exception {
    com.adguard.android.service.FilterService filterService = com.adguard.android.ServiceLocator.getInstance(context).getFilterService();
    com.adguard.android.service.PreferencesService preferencesService = com.adguard.android.ServiceLocator.getInstance(context).getPreferencesService();
    filterService.checkFilterUpdates(false);
    filterService.applyNewSettings();
    preferencesService.setLastUpdateCheck(java.lang.System.currentTimeMillis());
}