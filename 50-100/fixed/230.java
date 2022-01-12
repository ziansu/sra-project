private static int[] getStartingDate(java.util.Calendar realStart, boolean method) {
    int yyyy = realStart.get(java.util.Calendar.YEAR);
    int mm = realStart.get(java.util.Calendar.MONTH);
    int dd = java.lang.Math.min(30, realStart.get(java.util.Calendar.DAY_OF_MONTH));
    if ((!method) && (org.apache.poi.ss.formula.functions.Days360.isLastDayOfMonth(realStart)))
        dd = 30;
    
    return new int[]{ yyyy , mm , dd };
}