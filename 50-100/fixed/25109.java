public void afterTextChanged(android.text.Editable s) {
    try {
        com.androidandyuk.howlonghowoften.MainActivity.howManyInt = java.lang.Integer.parseInt(howMany.getText().toString());
        com.androidandyuk.howlonghowoften.MainActivity.completeInInt = (java.lang.Integer.parseInt(completeIn.getText().toString())) / (com.androidandyuk.howlonghowoften.MainActivity.multiplier);
    } catch (java.lang.NumberFormatException e) {
        e.printStackTrace();
    }
    updateDisplay();
}