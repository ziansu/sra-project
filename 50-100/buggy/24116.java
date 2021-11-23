public void setUnitPackageAsCompleted(android.content.Context context, org.pma.nutrifami.model.Lesson lesson, int unitPackage) {
    java.util.Set<java.lang.String> completedLessons = getCompletedLessons(context);
    completedLessons.add(formatUnitPackage(lesson.getId(), unitPackage));
    android.content.SharedPreferences.Editor editor = getPreferences(context).edit();
    editor.putStringSet(org.pma.nutrifami.lib.SessionManager.COMPLETED_LESSONS, completedLessons);
    editor.apply();
}