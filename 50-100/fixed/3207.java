public boolean isDayOffMorning() {
    return (((com.framgia.wsm.utils.common.StringUtils.isNotBlank(mTextMorning)) && (com.framgia.wsm.utils.common.StringUtils.isNotBlank(mTextAfternoon))) && (!(mTextMorning.equals(mTimeIn)))) && (mTextAfternoon.equals(mTimeOut));
}