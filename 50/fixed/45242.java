public void birthdayCheck(android.view.View view) {
    if (birthdayCheckBox.isChecked()) {
        birthdayChecked = true;
    }else {
        birthdayChecked = false;
        birthdayText = "Happy Birthday!";
    }
    setVisibility(birthdayChecked, birthdayEditText);
    saveBirthdayPreferences();
}