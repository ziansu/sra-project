@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    progress += 10;
    itemTime = (progress / 10) * 10;
    itemTimeView.setText(("TIMER : " + (timerItem.timeInMinutes((((long) (itemTime)) * 1000), com.androidandyuk.kitchentimer.MainActivity.timeViewStyle))));
}