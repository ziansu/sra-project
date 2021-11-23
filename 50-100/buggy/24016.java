private static void copy(com.example.brandon.habitlogger.HabitDatabase.DataModels.Habit dest, com.example.brandon.habitlogger.HabitDatabase.DataModels.Habit source) {
    dest.mName = source.mName;
    dest.mDescription = source.mDescription;
    dest.mCategory = source.mCategory;
    dest.mIconResId = source.mIconResId;
    dest.mDatabaseId = source.mDatabaseId;
    dest.mIsArchived = source.mIsArchived;
    if ((source.getEntries()) != null) {
        dest.mEntries = source.getEntries();
        dest.mEntriesDuration = source.calculateEntriesDurationSum();
    }
}