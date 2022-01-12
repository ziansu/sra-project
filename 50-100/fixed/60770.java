private boolean isValidPeriod(java.lang.String keyword) {
    if ((keyword.length()) != 7) {
        return false;
    }
    int period = cn.wisdom.lottery.common.utils.DataConvertUtils.toInt(keyword);
    int year = period / 1000;
    int no = period - (year * 1000);
    if (year < 2016) {
        return false;
    }
    if ((no < 1) || (no > 160)) {
        return false;
    }
    return true;
}