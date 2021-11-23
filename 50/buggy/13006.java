@java.lang.Override
public void onResume() {
    super.onResume();
    initViews();
    eventItemPresenter.setEmployeeId(com.belatrixsf.connect.managers.PreferencesManager.get().getEmployeeId());
    eventItemPresenter.getEvents(kindEvent);
}