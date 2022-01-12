@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    Data.nasobic = ((float) (progress + 100)) / 100;
    sparkView.populatePath();
    sparkView1.populatePath();
    sparkView2.populatePath();
    sparkView3.populatePath();
}