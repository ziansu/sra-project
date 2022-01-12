private static int[] getStartingDate(java.util.Calendar realStart, boolean method) {
    java.util.Calendar d = realStart;
    int yyyy = d.get(java.util.Calendar.YEAR);
    int mm = d.get(java.util.Calendar.MONTH);
    int dd = java.lang.Math.min(30, d.get(java.util.Calendar.DAY_OF_MONTH));
    if ((method == false) && (org.apache.poi.ss.formula.functions.Days360.isLastDayOfMonth(d)))
        dd = 30;
    
    return new int[]{ yyyy , mm , dd };
}