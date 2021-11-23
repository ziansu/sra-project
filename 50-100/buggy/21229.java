private void updateTextView() {
    displayFrequencyTextView.setText("");
    for (int loop = 0; loop <= 25; loop++) {
        displayAlphabetsTextView.append(((alphabetsCaps[loop]) + "\n"));
        displayFrequencyTextView.append(((": " + (alphabetsFrequency[loop])) + "\n"));
    }
}