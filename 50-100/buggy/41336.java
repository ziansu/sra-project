public boolean isDayOffAllDay() {
    return (((com.framgia.wsm.utils.common.StringUtils.isNotBlank(mTextMorning)) && (com.framgia.wsm.utils.common.StringUtils.isNotBlank(mTextAfternoon))) && (!(mTimeIn.equals(mTextMorning)))) && (!(mTimeOut.equals(mTextAfternoon)));
}