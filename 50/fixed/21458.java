public java.lang.String getFormatedDateTime(int i) {
    if (((dateList.size()) <= i) || (i < 0)) {
        return null;
    }
    return femr.util.stringhelpers.StringUtils.FormatDateTime(dateList.get(i));
}