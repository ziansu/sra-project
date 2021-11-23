@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    itemTime = (progress / 10) * 10;
    itemTimeView.setText(("TIMER : " + (timerItem.timeInMinutes((((long) (itemTime)) * 1000), com.androidandyuk.kitchentimer.MainActivity.timeViewStyle))));
}