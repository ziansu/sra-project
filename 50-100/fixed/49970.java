@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        default :
            break;
        case R.id.button_dismiss :
            dialog.dismiss();
            Alert911Stop();
            populateListView();
            break;
        case R.id.button_clearalerts :
            DB = new uk.ac.abertay.firedroidpager.SQLDatabaseHelper(this);
            DB.removeDataDB();
            populateListView();
            break;
    }
}