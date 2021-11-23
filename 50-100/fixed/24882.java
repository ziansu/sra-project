@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    ma.instituteID = which + 1;
    if ((ma.instituteID) == 6) {
        ma.instituteID = 7;
    }else {
        if ((ma.instituteID) == 7) {
            ma.instituteID = 0;
        }
    }
    changedInstitute = true;
    instituteViewer.setText(java.lang.String.valueOf(ma.instituteID));
}