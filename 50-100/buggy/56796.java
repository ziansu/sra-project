public boolean isDayOffAfternoon() {
    return (((com.framgia.wsm.utils.common.StringUtils.isBlank(mTextMorning)) && (com.framgia.wsm.utils.common.StringUtils.isNotBlank(mTextAfternoon))) && (mTimeIn.equals(mTextMorning))) && (!(mTimeOut.equals(mTextAfternoon)));
}