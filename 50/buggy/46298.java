@java.lang.Override
public boolean shouldShow(android.content.SharedPreferences p) {
    de.tum.in.tumcampusapp.auxiliary.Utils.log((("CountUnansweredQuesti: " + (manager.getUnansweredQuestions().getCount())) + " "));
    return (manager.getUnansweredQuestions().getCount()) >= 1;
}