private void getCustomFat() {
    android.widget.EditText customFat = ((android.widget.EditText) (findViewById(R.id.user_entered_fat)));
    if (!(checkMissingFieldError(customFat))) {
        customFatIsFilledIn = false;
    }else {
        double fatPerPound = java.lang.Double.parseDouble(customFat.getText().toString());
        totalProtein = ((int) ((weightInPounds) * fatPerPound));
    }
}