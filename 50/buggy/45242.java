public void birthdayCheck(android.view.View view) {
    boolean isChecked = birthdayCheckBox.isChecked();
    if (isChecked) {
        birthdayChecked = true;
    }else {
        birthdayChecked = false;
        birthdayText = "Happy Birthday!";
    }
    setVisibility(birthdayChecked, birthdayEditText);
    saveBirthdayPreferences();
}