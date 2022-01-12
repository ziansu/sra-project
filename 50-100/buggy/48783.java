@org.junit.Before
public void setUp() {
    dbHelper = new com.gtoz.uxsocialmedia.DBHelper(android.support.test.InstrumentationRegistry.getTargetContext());
    dbHelper.addFavorite(1);
    org.hamcrest.Matcher<android.view.View> matcher = org.hamcrest.Matchers.allOf(android.support.test.espresso.matcher.ViewMatchers.withText("Favorites"), android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.tabs)));
    android.support.test.espresso.Espresso.onView(matcher).perform(android.support.test.espresso.action.ViewActions.click());
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.locationList)).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed()));
}