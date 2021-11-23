public java.lang.String getHourToString(java.lang.String time) {
    if (time == (java.lang.String.valueOf(com.aimluck.eip.exttimecard.ExtTimecardListResultData.NO_DATA))) {
        return "";
    }
    return time + "h";
}