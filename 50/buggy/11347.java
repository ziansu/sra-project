public org.eclipse.swt.graphics.Color calculateBackColor() {
    return calculateAlarmColor(isBackColorAlarmSensitive, saveBackColor, isBeastAndActiveAlarm());
}