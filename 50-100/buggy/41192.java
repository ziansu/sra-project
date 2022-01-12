@android.test.UiThreadTest
public void testOnOffToggle() {
    com.seniordesign.autoresponder.Interface.Main activity = getActivity();
    final android.widget.Switch onOffToggle = ((android.widget.Switch) (activity.findViewById(R.id.autoRespond_switch)));
    assertNotNull(onOffToggle);
    activity.switchChecker(onOffToggle);
    assertTrue(onOffToggle.isChecked());
    onOffToggle.setChecked(false);
    activity.switchChecker(onOffToggle);
    assertFalse(onOffToggle.isChecked());
}