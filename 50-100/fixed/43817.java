private void validateToTime(java.lang.String toTime) {
    if (com.framgia.wsm.utils.common.DateTimeUtils.convertStringToDateTime(mRequestOverTime.getFromTime()).before(com.framgia.wsm.utils.common.DateTimeUtils.convertStringToDateTime(toTime))) {
        setToTime(toTime);
        return ;
    }
    validateErrorDialog(mContext.getString(R.string.end_time_is_less_than_start_time));
}