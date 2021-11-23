@java.lang.Override
public void onBackground(long time) {
    com.urbanairship.automation.Automation.isForeground = false;
    this.onEventAdded(JsonValue.NULL, Trigger.LIFE_CYCLE_BACKGROUND, 1.0);
    onScheduleConditionsChanged();
}