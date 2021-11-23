private int[] getTomorrow(int[] combined) {
    int day = getNextDayInt();
    int[] date = getDate(dooyit.parser.DateTimeParser.NEXT_DAY);
    int[] ans = new int[]{ day , combined[dooyit.parser.DateTimeParser.COMBINED_INDEX_TIME] , date[dooyit.parser.DateTimeParser.DATE_INDEX_DD] , date[dooyit.parser.DateTimeParser.DATE_INDEX_MM] , date[dooyit.parser.DateTimeParser.DATE_INDEX_YY] , combined[dooyit.parser.DateTimeParser.COMBINED_INDEX_COUNTER] };
    printArray(ans);
    return ans;
}