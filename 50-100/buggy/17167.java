public long dailyWorkingTimeOf(long start, long end) {
    if (((start == 0) || (end == 0)) || (end <= start))
        return 0;
    
    long worked = end - start;
    if (worked >= (com.runafter.wtt.WorkingTimeCalculator.MILLISECONDS_OF_8_HOURS))
        return java.lang.Math.max((worked - (com.runafter.wtt.WorkingTimeCalculator.MILLISECONDS_OF_1_HOUR)), com.runafter.wtt.WorkingTimeCalculator.MILLISECONDS_OF_12_HOURS);
    
    if (worked >= (com.runafter.wtt.WorkingTimeCalculator.MILLISECONDS_OF_4_HOURS))
        return worked - (com.runafter.wtt.WorkingTimeCalculator.MILLISECONDS_OF_30_MINUTES);
    
    return worked;
}