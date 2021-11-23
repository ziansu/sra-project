@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    myView = inflater.inflate(R.layout.fragment_take_attendance_today, container, false);
    calendar = java.util.Calendar.getInstance();
    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, MM_dd_yyyy");
    java.lang.String stringTime = simpleDateFormat.format(calendar.getTime());
    textTime = ((android.widget.TextView) (myView.findViewById(R.id.text_Time)));
    textTime.setText(stringTime);
    return inflater.inflate(R.layout.fragment_take_attendance_today, container, false);
}