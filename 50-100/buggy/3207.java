public boolean isDayOffMorning() {
    return (((com.framgia.wsm.utils.common.StringUtils.isNotBlank(mTextMorning)) && (com.framgia.wsm.utils.common.StringUtils.isBlank(mTextAfternoon))) && (!(mTimeIn.equals(mTextMorning)))) && (mTimeOut.equals(mTextAfternoon));
}