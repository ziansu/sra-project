@org.junit.Test
public void navigation() {
    android.support.test.espresso.contrib.DrawerActions.openDrawer(R.id.drawer_layout);
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withText(R.string.nav_folder)).perform(android.support.test.espresso.action.ViewActions.click());
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.recycler_view)).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.isDisplayed()));
}