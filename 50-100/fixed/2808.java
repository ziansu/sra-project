public static java.lang.String showOldValue(android.content.SharedPreferences exercise_a) {
    java.lang.String sq1 = exercise_a.getString("squats1", "");
    java.lang.String sq2 = exercise_a.getString("squats2", "");
    java.lang.String sq3 = exercise_a.getString("squats3", "");
    java.lang.String sq4 = exercise_a.getString("squats4", "");
    java.lang.String sq5 = exercise_a.getString("squats5", "");
    java.lang.String crw1 = exercise_a.getString("CalfRaiseWeight1", "");
    return crw1 + (gymprogram_a.sDateTime);
}