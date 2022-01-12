public void setDebugEnabled(boolean enabled) {
    getConfig().setBool("app", "debug", enabled);
    org.linphone.core.LinphoneCoreFactory.instance().enableLogCollection(enabled);
    org.linphone.core.LinphoneCoreFactory.instance().setDebugMode(enabled, getString(R.string.app_name));
}