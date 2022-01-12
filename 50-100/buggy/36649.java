public void ButtonClear(android.view.View v) {
    final android.widget.Button myButton = ((android.widget.Button) (findViewById(R.id.button_number_clear)));
    ChangeButtonColour(myButton);
    android.widget.TextView ScreenOfNumber = ((android.widget.TextView) (findViewById(R.id.show_calculations)));
    ScreenOfNumber.setText("");
    numberOfBrackets = 0;
    previousOperation = "random";
}