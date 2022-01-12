@org.junit.Test
public void clickStartButtonOnce() {
    com.context.kroket.escapeapp.MainActivity.swithOnGameB();
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.connectButton)).perform(android.support.test.espresso.action.ViewActions.click());
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.clickButton)).perform(android.support.test.espresso.action.ViewActions.click());
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.clickButton)).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.withText("CLICK ME!")));
    com.context.kroket.escapeapp.MainActivity.swithOnGameB();
}