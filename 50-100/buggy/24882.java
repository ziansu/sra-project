@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    ma.instituteID = which + 1;
    if ((ma.instituteID) == 5) {
        ma.instituteID = 7;
    }
    if ((ma.instituteID) == 6) {
        ma.instituteID = 0;
    }
    changedInstitute = true;
    instituteViewer.setText(java.lang.String.valueOf(ma.instituteID));
}