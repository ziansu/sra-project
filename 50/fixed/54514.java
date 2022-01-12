@java.lang.Override
public void onBackground(long time) {
    this.onEventAdded(JsonValue.NULL, Trigger.LIFE_CYCLE_BACKGROUND, 1.0);
    onScheduleConditionsChanged();
}