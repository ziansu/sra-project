@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    com.tuxskar.caluma.ws.models.SubjectSimple element = ((com.tuxskar.caluma.ws.models.SubjectSimple) (buttonView.getTag()));
    if (isChecked) {
        addCalendarEvent(element);
    }else {
        removeCalendarEvent(element);
    }
    element.setSelected(isChecked);
}