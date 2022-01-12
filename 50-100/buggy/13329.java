private void validateLeaveEarlyWomanA(java.lang.String checkoutTime) {
    if (validateLeaveEarlyABase(checkoutTime)) {
        return ;
    }
    float maxDuration = mUser.getMaxDurationLeave(mCurrentLeaveTypePosition, mCurrentBranchPosition);
    if (!(com.framgia.wsm.utils.common.DateTimeUtils.checkHourOfDateLessThanOrEqualWithDuration(mCurrentShifts.getTimeOut(), checkoutTime, maxDuration))) {
        validateErrorDialog(mContext.getString(R.string.your_amount_tim_can_not_greater_than_max_allow_time));
        return ;
    }
    if (com.framgia.wsm.utils.common.DateTimeUtils.checkHourOfDateLessThan(checkoutTime, mHourOfTimeOut, mMinuteOfTimeOut)) {
        setCheckoutTime(checkoutTime);
        return ;
    }
    validateErrorDialog(mContext.getString(R.string.your_time_can_not_be_later_than_time_out_company));
}