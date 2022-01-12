private void updateUI() {
    try {
        actions.clear();
        actions.addAll(eu.power_switch.database.handler.DatabaseHandler.getAlarmActions(eu.power_switch.shared.constants.SleepAsAndroidConstants.SLEEP_AS_ANDROID_ALARM_EVENT.getById(spinnerEventType.getSelectedItemPosition())));
    } catch (java.lang.Exception e) {
        eu.power_switch.gui.StatusMessageHandler.showErrorMessage(getActivity(), e);
    }
    recyclerViewAdapter.notifyDataSetChanged();
}