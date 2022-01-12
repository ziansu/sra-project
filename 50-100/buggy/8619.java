public void showDatabase() {
    if ((preferenceChecker.howToDisplayCategories()) != (com.example.brandon.habitlogger.Preferences.PreferenceChecker.AS_CARDS)) {
        habitList = habitDatabase.getHabits();
        habitAdapter = new com.example.brandon.habitlogger.RecyclerViewAdapters.HabitViewAdapter(habitList, menuItemClickListener, buttonClickListener);
        if ((habitDisplayMode) == (ONLY_ARCHIVED_HABITS))
            com.example.brandon.habitlogger.common.MyCollectionUtils.filter(habitList, Habit.FilterOutNonArchivedHabits);
        else
            if ((habitDisplayMode) == (NO_ARCHIVED_HABITS))
                com.example.brandon.habitlogger.common.MyCollectionUtils.filter(habitList, Habit.FilterOutArchivedHabits);
            
        
        java.util.Collections.sort(habitList, Habit.CategoryNameComparator);
        habitCardContainer.setAdapter(habitAdapter);
    }
}