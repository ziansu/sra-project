@java.lang.Override
public void onClick(boolean b) {
    if ((config.dialog) == null) {
        startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(config.privacyHtmlPath)));
    }else {
        config.dialog.open(this, config.privacyHtmlPath, getString(R.string.egab_privacy_policy));
    }
    if ((config.analytics) != null) {
        config.analytics.logUiEvent(config.logUiEventName, getString(R.string.egab_privacy_log_event));
    }
}