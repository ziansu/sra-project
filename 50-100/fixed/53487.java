public static boolean isSameDay(java.util.Calendar a, java.util.Calendar b) {
    if ((a == null) || (b == null))
        return false;
    
    return (((a.get(java.util.Calendar.YEAR)) == (b.get(java.util.Calendar.YEAR))) && ((a.get(java.util.Calendar.MONTH)) == (b.get(java.util.Calendar.MONTH)))) && ((a.get(java.util.Calendar.DAY_OF_MONTH)) == (b.get(java.util.Calendar.DAY_OF_MONTH)));
}