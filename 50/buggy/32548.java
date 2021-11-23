private void setDateFormat() {
    mFormat = (is24HoutFormat.blockingGet()) ? com.better.alarm.view.DigitalClock.M24 : com.better.alarm.view.DigitalClock.M12;
    mAmPm.setShowAmPm((((mFormat) == (com.better.alarm.view.DigitalClock.M12)) || (isInEditMode())));
}