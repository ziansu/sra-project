public void setSelectedWeekDays(java.util.List<java.lang.Integer> numbers) {
    for (int i = 0; i < (numbers.size()); i++) {
        int index = org.light.justwaker.model.DayOfWeek.getIndexByNumber(numbers.get(i));
        android.widget.ToggleButton btn = buttons.get(index);
        btn.setChecked(true);
    }
}