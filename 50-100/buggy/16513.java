@java.lang.Override
public void onClick() {
    if ((config.dialog) == null) {
        startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(config.companyHtmlPath)));
    }else {
        config.dialog.open(this, config.companyHtmlPath, config.aboutLabelTitle);
    }
    if ((config.analytics) != null) {
        config.analytics.logUiEvent(config.logUiEventName, config.aboutLabelTitle);
    }
}