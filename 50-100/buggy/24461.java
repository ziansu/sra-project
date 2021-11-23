@org.androidannotations.annotations.Click(value = R.id.mGetCodeButton)
void onGetCodeButtonClick(android.view.View view) {
    progressView.setVisibility(View.VISIBLE);
    java.lang.String code = countryCodeText.getText().toString();
    java.lang.String number = phoneNumberText.getText().toString();
    com.jaspreet.worldwidelive.preferences.PreferenceConnector.writeString(PreferenceConnector.PREF_USER_PHONE_NUMBER, (code + number), getActivity());
    presenter.onLoginClick((code + number));
}