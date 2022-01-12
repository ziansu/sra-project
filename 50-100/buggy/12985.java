@java.lang.Override
public void onClick(android.view.View view) {
    com.sweproject.calorietracker.MainActivity.insertDBData(com.sweproject.calorietracker.DataObjects.Food_Day.class, this, new com.sweproject.calorietracker.DataObjects.Food_Day(FragmentCalendar.currentDay.getId(), ((mServingSpin.getSelectedItemPosition()) + 1), mServingSizes.get(mSelectedIndex).getId()), false);
}