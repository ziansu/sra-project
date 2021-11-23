public void testInitialPeriodValue0() {
    edu.westga.ryanfleminginvestmentcalculator.MainActivity activity = getActivity();
    android.widget.EditText periodTextView = ((android.widget.EditText) (activity.findViewById(R.id.editTextPeriod)));
    java.lang.String period = periodTextView.getText().toString();
    assertEquals("0", period);
}