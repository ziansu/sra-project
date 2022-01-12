@org.junit.Test
public void testEspresso() {
    android.support.test.espresso.ViewInteraction interaction = android.support.test.espresso.Espresso.onView(org.hamcrest.CoreMatchers.allOf(withId(R.id.editText), withText("this is a test"), hasFocus()));
    interaction.perform(android.support.test.espresso.action.ViewActions.replaceText("how about some new text"));
    android.support.test.espresso.ViewInteraction interaction2 = android.support.test.espresso.Espresso.onView(org.hamcrest.CoreMatchers.allOf(withId(R.id.editText), withText("how about some new text")));
    interaction2.check(android.support.test.espresso.assertion.ViewAssertions.matches(hasFocus()));
}