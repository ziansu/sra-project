@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((alarm) != null)
        alarm.putAlarm(outState);
    
    if (((contentView.getTag()) != null) && ((contentView.getTag()) instanceof java.lang.Integer))
        outState.putInt(com.nulleye.yaaa.activities.AlarmActivity.ANIMATION_PERCENT, ((java.lang.Integer) (contentView.getTag())));
    
}