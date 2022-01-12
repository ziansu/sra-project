@java.lang.Override
public void onClick(android.view.View v) {
    if (visibilityCheck.isChecked()) {
        if (mainActivity.schoolsToView.contains(values[position])) {
            mainActivity.schoolsToView.remove(values[position]);
        }else {
            mainActivity.schoolsToView.add(values[position]);
        }
    }else {
        if (mainActivity.schoolsToView.contains(values[position])) {
            mainActivity.schoolsToView.remove(values[position]);
        }
    }
    mainActivity.viewCalendarList();
}