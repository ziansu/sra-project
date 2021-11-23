@java.lang.Override
public void onClick(android.view.View v) {
    slidrawer.animateOpen();
    pl = "";
    title.setText("");
    desc.setText("");
    date.setText("Date");
    time.setText("Time");
    location.setText("Pick a Location");
    com.amoli.personalto_dolist.fragments.DatePicker.date = null;
    com.amoli.personalto_dolist.fragments.TimePicker.time = null;
    flag = 1;
}