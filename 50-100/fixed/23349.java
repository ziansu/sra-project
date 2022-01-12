public void testFiveLetterWordRadioButton() {
    this.setUp();
    android.widget.RadioButton fiveLetterRadioButton = ((android.widget.RadioButton) (activity.findViewById(R.id.fiveLetterRadioButton)));
    getInstrumentation().waitForIdleSync();
    for (int i = 0; i < 5; i++) {
        android.test.TouchUtils.clickView(this, fiveLetterRadioButton);
        android.widget.TextView scrambledWordTextView = ((android.widget.TextView) (activity.findViewById(R.id.scrambledWordTextView)));
        assertEquals(5, scrambledWordTextView.getText().toString().length());
    }
}