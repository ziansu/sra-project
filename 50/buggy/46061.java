@java.lang.Override
public void onClick() {
    com.eggheadgames.aboutbox.activity.AboutActivity.getOpenFacebookIntent(this, config.facebookUserName);
    if ((config.analytics) != null) {
        config.analytics.logUiEvent(config.logUiEventName, getString(R.string.egab_facebook_log_event));
    }
}