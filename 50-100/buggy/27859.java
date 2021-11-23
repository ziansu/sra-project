private static void removeLastCheckmark(@android.support.annotation.NonNull
final com.ivanmagda.habito.models.Habit habit) {
    com.ivanmagda.habito.models.HabitRecord record = habit.getRecord();
    if ((record.getCheckmarks().size()) > 0) {
        com.ivanmagda.habito.utils.HabitoScoreUtils.removeCheckmarkAtIndex(habit, ((record.getCheckmarks().size()) - 1));
    }
}