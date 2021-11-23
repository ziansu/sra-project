private int setDayInt(java.lang.String str) {
    int ans = dooyit.common.datatype.DateTime.UNINITIALIZED;
    for (int i = 0; i < (daysInWeek.length); i++) {
        if (str.equals(daysInWeek[i])) {
            ans = i;
            break;
        }
    }
    return ans;
}