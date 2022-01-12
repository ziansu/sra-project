public void testInitialRateValue0() {
    edu.westga.ryanfleminginvestmentcalculator.MainActivity activity = getActivity();
    android.widget.EditText rateTextView = ((android.widget.EditText) (activity.findViewById(R.id.editTextRate)));
    java.lang.String rate = rateTextView.getText().toString();
    assertEquals(rate, "0.00");
}