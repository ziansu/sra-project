private int getMinute() {
    java.lang.String time = getTime();
    if ((time == null) || (!(time.matches(com.fsck.k9.preferences.TimePickerPreference.VALIDATION_EXPRESSION)))) {
        return -1;
    }
    return java.lang.Integer.valueOf(time.split(":")[1]);
}