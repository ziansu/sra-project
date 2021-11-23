@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    fromTime = newVal;
    toPicker.setMinValue(((fromTime) + 1));
    toPicker.setMaxValue(28);
    toPicker.setDisplayedValues(com.wafflestudio.snutt.SNUTTUtils.getTimeList(((fromTime) + 1), 28));
    toPicker.setValue(((fromTime) + 1));
    toTime = (fromTime) + 1;
}