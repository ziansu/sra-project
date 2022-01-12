private boolean isAfterCurrentDate(int inputDay, int inputMonth) {
    c.setTimeInMillis(java.lang.System.currentTimeMillis());
    boolean case1 = inputMonth > (c.get(java.util.Calendar.MONTH));
    boolean case2 = (inputMonth == (c.get(java.util.Calendar.MONTH))) && (inputDay >= (c.get(java.util.Calendar.DAY_OF_MONTH)));
    return case1 || case2;
}