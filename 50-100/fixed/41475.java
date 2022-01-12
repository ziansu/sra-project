@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    Data.nasobic = ((double) (progress)) / 100;
    sparkView.populatePath();
    sparkView1.populatePath();
    sparkView2.populatePath();
    sparkView3.populatePath();
}