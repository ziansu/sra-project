@org.junit.Before
public void setUp() {
    for (int i = 0; i < 2; i++) {
        android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.rv1)).perform(android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition(4, android.support.test.espresso.action.ViewActions.click()));
    }
}