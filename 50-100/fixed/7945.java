@cucumber.api.java.en.Given(value = "^I am viewing the visual verification activity$")
public void iHaveAVisualVerificationActivity() {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.nervousfish.nervousfish.activities.VisualVerificationActivity.class);
    intent.putExtra(ConstantKeywords.SERVICE_LOCATOR, getCurrentActivity().getIntent().getSerializableExtra(ConstantKeywords.SERVICE_LOCATOR));
    getActivity().startActivity(intent);
}