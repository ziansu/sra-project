public int getPosition(int year, int month, int date) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.set(year, month, 1);
    this.date = date;
    return (com.mommoo.materialpicker.adapter.DatePickerViewPagerAdapter.BASE_POSITION) + (howFarFromBase(cal.get(java.util.Calendar.YEAR), cal.get(java.util.Calendar.MONTH)));
}