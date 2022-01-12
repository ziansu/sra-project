private static boolean isLaborDay(java.util.Calendar toCheck) {
    return (((toCheck.get(java.util.Calendar.MONTH)) == (java.util.Calendar.SEPTEMBER)) && ((toCheck.get(java.util.Calendar.DAY_OF_WEEK)) == (java.util.Calendar.MONDAY))) && ((toCheck.get(java.util.Calendar.DAY_OF_MONTH)) <= 7);
}