@org.junit.Test
@android.support.test.filters.LargeTest
public void test2() throws java.lang.Exception {
    addProgramTraining(ru.codingworkshop.gymm.TrainingProgramTest.TRAINING_NAME_TEXT);
    addProgramExercise();
    addProgramSet();
    close(true);
    java.lang.String exerciseName = data.select(ru.codingworkshop.gymm.data.model.ProgramExercise.class).get().first().getExercise().getName();
    selectProgramExercise(0);
    selectExercise(1);
    close(false);
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withText(exerciseName)).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.isDisplayed()));
}