@java.lang.Override
public void onIndexChangeListener(com.edmodo.rangebar.RangeBar rangeBar, int leftThumbIndex, int rightThumbIndex) {
    minWordLength = leftThumbIndex + (minWordLength);
    maxWordLength = rightThumbIndex + (minWordLength);
    minChar.setText(java.lang.String.valueOf(minWordLength));
    maxChar.setText(java.lang.String.valueOf(maxWordLength));
}