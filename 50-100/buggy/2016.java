@org.junit.Test
public void test3CeckGroupChange() {
    android.support.test.espresso.Espresso.onView(withId(R.id.settings_numberPicker)).perform(fachschaftwirtschaft.fachschaftapp.SettingsActivityTest.selectCurrentNumber(2));
    android.support.test.espresso.Espresso.onView(withId(R.id.settings_btn)).perform(click());
    android.support.test.espresso.Espresso.onView(withId(R.id.settings_textView4)).check(matches(isDisplayed())).check(matches(withText("2")));
}