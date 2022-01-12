@java.lang.Override
public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
    tvTime.setText(((hourOfDay + ":") + minute));
    ans.setTime(((hourOfDay + ":") + minute));
    answer.onAnswerSave(ans);
}