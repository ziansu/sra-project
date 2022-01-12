private int[] getDate(int fastForward) {
    int newDay = (currDay) + fastForward;
    int newMonth = currMonth;
    int newYear = currYear;
    while (newDay > (daysInMonth[newMonth])) {
        newDay -= daysInMonth[newMonth];
        newMonth += 1;
    } 
    if (newMonth > 12) {
        newMonth = 1;
        newYear = newYear + 1;
    }
    int[] ans = new int[]{ newDay , newMonth , newYear };
    return ans;
}