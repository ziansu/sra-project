@org.junit.Test
public void ratingDialogIsShown() {
    org.junit.Assume.assumeTrue((!(org.totschnig.myexpenses.util.DistribHelper.isGithub())));
    PrefKey.NEXT_REMINDER_RATE.remove();
    stubExpenseEditIntentWithSequenceCount(((org.totschnig.myexpenses.activity.MyExpenses.TRESHOLD_REMIND_RATE) + 1));
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.CREATE_COMMAND)).perform(android.support.test.espresso.action.ViewActions.click());
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.rating_how_many)).check(android.support.test.espresso.assertion.ViewAssertions.matches(android.support.test.espresso.matcher.ViewMatchers.isDisplayed()));
}