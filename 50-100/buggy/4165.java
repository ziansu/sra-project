@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    com.kaist.lts.ClientActivity.dueDate = (((year + "-") + monthOfYear) + "-") + dayOfMonth;
    android.widget.Toast.makeText(com.kaist.lts.ClientActivity.mContext, com.kaist.lts.ClientActivity.dueDate, Toast.LENGTH_SHORT).show();
}