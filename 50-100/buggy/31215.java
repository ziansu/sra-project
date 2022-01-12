@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.i("MyMapsActivity", "DialogInterface onClick ");
    getLatLngForSearchLocationFromAddress(((locationToSearchFor.getText().toString()) + "new york ny"));
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    com.crashlytics.android.answers.Answers.getInstance().logContentView(new com.crashlytics.android.answers.ContentViewEvent().putContentName(AnswersManager.SEARCHED_FOR_BUS).putContentType(AnswersManager.SELECTION).putCustomAttribute(AnswersManager.ADDRESS_SEARCHED, locationToSearchFor.getText().toString()));
}