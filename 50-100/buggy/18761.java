@org.junit.Test
public void testClick() throws java.lang.Exception {
    org.hamcrest.Matcher toolbarMatcher = android.support.test.espresso.matcher.ViewMatchers.withId(R.id.jump_button);
    android.support.test.espresso.Espresso.onView(toolbarMatcher).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.isDisplayed()));
    java.lang.Thread.sleep((3 * 1000));
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.jump_button)).perform(android.support.test.espresso.action.ViewActions.click());
}