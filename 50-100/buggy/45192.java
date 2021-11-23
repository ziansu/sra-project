public static void enterSearchQuery(android.app.Activity activity, java.lang.String query) {
    org.xbmc.kore.testhelpers.TestUtils.clickMenuItem(activity, activity.getString(R.string.action_search), R.id.action_search);
    android.support.test.espresso.Espresso.onView(org.hamcrest.Matchers.allOf(android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom(android.widget.AutoCompleteTextView.class))).perform(android.support.test.espresso.action.ViewActions.click(), android.support.test.espresso.action.ViewActions.typeText(query));
    android.support.test.espresso.Espresso.closeSoftKeyboard();
}