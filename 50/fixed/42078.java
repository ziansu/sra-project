@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    numWords = progress + (numWords);
    numWordsDisplay.setText(java.lang.String.valueOf(numWords));
}