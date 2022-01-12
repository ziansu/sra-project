@cucumber.api.java.en.Given(value = "^I am viewing the visual verification activity$")
public void iHaveAVisualVerificationActivity() {
    android.support.test.espresso.Espresso.onView(android.support.test.espresso.matcher.ViewMatchers.withId(R.id.password)).perform(android.support.test.espresso.action.ViewActions.closeSoftKeyboard());
    android.content.Intent intent = new android.content.Intent(getActivity(), com.nervousfish.nervousfish.activities.VisualVerificationActivity.class);
    intent.putExtra(ConstantKeywords.SERVICE_LOCATOR, getCurrentActivity().getIntent().getSerializableExtra(ConstantKeywords.SERVICE_LOCATOR));
    getActivity().startActivity(intent);
    assertEquals(getCurrentActivity().getClass(), com.nervousfish.nervousfish.activities.VisualVerificationActivity.class);
}