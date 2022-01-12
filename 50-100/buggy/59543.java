@java.lang.Override
public void onIndexChangeListener(com.edmodo.rangebar.RangeBar rangeBar, int leftThumbIndex, int rightThumbIndex) {
    minWordLength = leftThumbIndex + 3;
    maxWordLength = rightThumbIndex + 3;
    minChar.setText(java.lang.String.valueOf(minWordLength));
    maxChar.setText(java.lang.String.valueOf(maxWordLength));
}