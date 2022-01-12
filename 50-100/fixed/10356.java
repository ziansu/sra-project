@java.lang.Override
public void onClick(android.view.View v) {
    if (((selectedDevelopment) != null) && (!(selectedDevelopment.isEmpty()))) {
        mSharedPrefEditor.putString(Constants.KEY_HOUSING_DEVELOPMENT, selectedDevelopment).apply();
        android.content.Intent intent = new android.content.Intent(this, com.nychareport.backlog.activities.HomePageActivity.class);
        startActivity(intent);
        finish();
    }
}