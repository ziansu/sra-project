@org.junit.Test
public void selectImageMenuOptionVisible() {
    android.support.test.espresso.Espresso.closeSoftKeyboard();
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.action_select_image)).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.isDisplayed()));
    mRotationHelper.rotateScreen();
    android.support.test.espresso.Espresso.closeSoftKeyboard();
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.action_select_image)).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.isDisplayed()));
}