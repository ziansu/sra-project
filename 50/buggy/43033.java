@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser) {
        canvas.setRadius(progress);
        brushDialog.setTitle(("Circle Radius: " + (canvas)));
    }
}