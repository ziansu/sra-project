@org.junit.Test
public void locationIsSentToRestaurantsActivity() {
    java.lang.String location = "Portland";
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.locationEditText)).perform(android.support.test.espresso.action.ViewActions.typeText(location));
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.findRestaurantsButton)).perform(click());
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.locationTextView)).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.withText(("Here are all the restaurants near: " + location))));
}