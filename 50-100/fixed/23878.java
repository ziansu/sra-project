@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    startText.setText(formatTime(progress));
    final int currentTimePoint = floorPosition(progress, 0, true);
    if (currentTimePoint != (this.currentTimePoint)) {
        this.currentTimePoint = currentTimePoint;
        webView.loadUrl((("javascript:highlight(" + currentTimePoint) + ");"));
    }
}