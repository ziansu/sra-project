public long getStartingTimeIgnoreTimeOfDay() {
    return com.example.brandon.habitlogger.common.MyTimeUtils.setTimePortion(getStartingTime(), true, 0, 0, 0, 0);
}