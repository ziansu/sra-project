@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    numWords = progress + 3;
    numWordsDisplay.setText(java.lang.String.valueOf(numWords));
}