private void needFinishActivity() {
    clearCurrentState();
    presentFragment(new org.telegram.ui.DialogsActivity(null), true);
    org.telegram.messenger.NotificationCenter.getInstance().postNotificationName(NotificationCenter.mainUserInfoChanged);
    org.telegram.techrunch.TechranchConfig config = new org.telegram.techrunch.TechranchConfig(getParentActivity());
    if (!(config.isCitySelected())) {
        presentFragment(new org.telegram.techrunch.select_city.SelectCity(), false);
    }
}