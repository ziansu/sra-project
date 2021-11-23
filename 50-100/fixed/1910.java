@java.lang.Override
public void onClick(android.view.View v) {
    cv = ((fr.wildcodeschool.haa.waxym.CalendarView) (findViewById(R.id.calendar_view)));
    if (isEdit) {
        cv.updateCalendar(null, true);
        editButton.setBackgroundResource(R.drawable.annul);
        isEdit = false;
    }else {
        cv.updateCalendar(null, false);
        editButton.setBackgroundResource(R.drawable.edit);
        isEdit = true;
    }
}