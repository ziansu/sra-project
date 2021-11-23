@java.lang.Override
public void onClick(boolean b) {
    openApp(config.buildType, config.packageName);
    if ((config.analytics) != null) {
        config.analytics.logUiEvent(config.logUiEventName, getString(R.string.egab_review_log_event));
    }
}