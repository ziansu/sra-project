@org.junit.Test
public void things4() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.fab)).perform(android.support.test.espresso.action.ViewActions.click());
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.recycler_view)).perform(android.support.test.espresso.action.ViewActions.swipeUp());
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.recycler_view)).perform(android.support.test.espresso.action.ViewActions.pressBack());
}