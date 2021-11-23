@java.lang.Override
public void onTick(long millisUntilFinished) {
    java.lang.String time = timeFormatter(millisUntilFinished);
    updateTextViewTime(time);
}