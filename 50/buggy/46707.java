@java.lang.Override
public void onTick(long millisUntilFinished) {
    java.lang.String time = timeFormatter(millisUntilFinished);
    android.util.Log.d("waleola", "called onTick");
    updateTextViewTime(time);
}