@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    if (isDataSet) {
        com.example.umyhpuscdi.danceapp15.CreateEditCourse.buttonTime.setText(chosenTime);
    }else {
        com.example.umyhpuscdi.danceapp15.CreateEditCourse.buttonTime.setText(getResources().getText(R.string.tid_datum));
    }
}