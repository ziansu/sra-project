@java.lang.Override
public void onDateSet(com.fourmob.datetimepicker.date.DatePickerDialog datePickerDialog, int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
    android.text.TextPaint paint = tv_date.getPaint();
    paint.setFakeBoldText(true);
    tv_date.setText((((((year + "年") + month) + "月") + day) + "日"));
}