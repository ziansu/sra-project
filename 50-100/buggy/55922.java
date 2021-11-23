@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if ((editable.toString().length()) > 0) {
        try {
            returnLegMiles = java.lang.Integer.parseInt(editable.toString());
            calculateFuel();
        } catch (java.lang.NumberFormatException e) {
        }
    }else {
        returnLegMiles = 0;
        jokerFuelResultTextView.setText("");
        bingoFuelResultTextView.setText("");
        savedStatusTextView.setVisibility(View.GONE);
        savedStatusTextView.setText("");
    }
}