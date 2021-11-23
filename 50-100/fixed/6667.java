public java.util.List<java.lang.Integer> getDaysFromThisMonth(int month, int year) {
    java.util.Calendar cal = new java.util.GregorianCalendar();
    cal.set(year, month, 1);
    int max = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
    java.lang.System.out.println(max);
    java.util.List<java.lang.Integer> daysFromThisMonth = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < max; i++) {
        daysFromThisMonth.add((i + 1));
    }
    return daysFromThisMonth;
}