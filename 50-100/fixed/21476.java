public java.lang.String getTimeOut() {
    if ((com.framgia.wsm.utils.common.StringUtils.isBlank(mTimeOut)) && (com.framgia.wsm.utils.common.StringUtils.isBlank(mTextAfternoon))) {
        return "";
    }
    if ((com.framgia.wsm.utils.common.StringUtils.isNotBlank(mTextAfternoon)) && (mTextAfternoon.equals(mTimeOut))) {
        return com.framgia.wsm.utils.common.DateTimeUtils.convertUiFormatToDataFormat(mTimeOut, DateTimeUtils.INPUT_TIME_FORMAT, DateTimeUtils.TIME_FORMAT_HH_MM);
    }
    return mTextAfternoon;
}