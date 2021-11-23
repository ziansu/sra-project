private void init() {
    setOrientation(com.auth0.android.lock.views.VERTICAL);
    setGravity(Gravity.CENTER);
    boolean showSocial = !(lockWidget.getConfiguration().getSocialStrategies().isEmpty());
    boolean showPasswordless = (lockWidget.getConfiguration().getDefaultPasswordlessStrategy()) != null;
    if (showSocial) {
        addSocialLayout(showPasswordless);
    }
    if (showPasswordless) {
        if (showSocial) {
            addSeparator();
        }
        addPasswordlessLayout();
    }
}