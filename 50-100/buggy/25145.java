public void onClick(android.content.DialogInterface dialog, int id) {
    float balance = userPreferences.getFloat("Balance", LoginActivity.INIT_BALANCE);
    float amount = java.lang.Float.parseFloat(amountEditField.getEditableText().toString());
    android.content.SharedPreferences.Editor prefsEditr = userPreferences.edit();
    prefsEditr.putBoolean("Refilled", true);
    prefsEditr.putFloat("Balance", (balance - amount));
    finish();
}