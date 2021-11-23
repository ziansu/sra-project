@java.lang.Override
public void onResume() {
    updateTimeWidgets(is24HourTime);
    if (!(showMeetingTypes)) {
        android.widget.TextView textView = ((android.widget.TextView) (getView().findViewById(R.id.findMeetingTypesTextView)));
        textView.setVisibility(View.GONE);
        if ((meetingTypesSpinner) != null)
            meetingTypesSpinner.setVisibility(View.GONE);
        
    }
    super.onResume();
}