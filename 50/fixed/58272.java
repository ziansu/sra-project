@java.lang.Override
public void onClick(boolean b) {
    openPublisher(config.buildType, config.appPublisher, config.packageName);
    if ((config.analytics) != null) {
        config.analytics.logUiEvent(config.logUiEventName, getString(R.string.egab_try_other_app_log_event));
    }
}