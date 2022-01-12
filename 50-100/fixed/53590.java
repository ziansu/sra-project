@org.junit.Test
public void subCategoryEditTextVisible() {
    android.support.test.espresso.Espresso.closeSoftKeyboard();
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.edit_sub_category)).perform(android.support.test.espresso.action.ViewActions.scrollTo()).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.isDisplayed()));
    mRotationHelper.rotateScreen();
    android.support.test.espresso.Espresso.closeSoftKeyboard();
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.edit_sub_category)).perform(android.support.test.espresso.action.ViewActions.scrollTo()).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.isDisplayed()));
}