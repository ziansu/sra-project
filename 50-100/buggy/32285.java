private int[] getDate(int fastForward) {
    int newDay = (currDay) + fastForward;
    int newMonth = currMonth;
    int newYear = currYear;
    if (newDay > (daysInMonth[currMonth])) {
        newDay = newDay - (daysInMonth[currMonth]);
        newMonth = newMonth + 1;
    }
    if (newMonth > 12) {
        newMonth = 1;
        newYear = newYear + 1;
    }
    int[] ans = new int[]{ newDay , newMonth , newYear };
    return ans;
}