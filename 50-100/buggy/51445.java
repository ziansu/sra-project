private int setDayInt(java.lang.String str) {
    int ans = dooyit.common.datatype.DateTime.UNINITIALIZED;
    for (int i = 0; i < (daysInWeek.length); i++) {
        if (str.equals(daysInWeek)) {
            ans = i + 1;
            break;
        }
    }
    return ans;
}