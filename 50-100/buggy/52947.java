public int getPosition(int year, int month) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.set(year, month, 1);
    return (com.mommoo.materialpicker.adapter.DatePickerViewPagerAdapter.BASE_POSITION) + (howFarFromBase(cal.get(java.util.Calendar.YEAR), cal.get(java.util.Calendar.MONTH)));
}