@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    com.tuxskar.caluma.ws.models.SubjectSimple element = ((com.tuxskar.caluma.ws.models.SubjectSimple) (viewHolder.checkbox.getTag()));
    if (isChecked) {
        addCalendarEvent(element);
    }else {
        removeCalendarEvent(element);
    }
    element.setSelected(buttonView.isChecked());
}