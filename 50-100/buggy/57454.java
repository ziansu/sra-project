@java.lang.Override
public void onClick(android.view.View v) {
    if ((intakelistViewItem.getItemNumStr()) == 1) {
        org.androidtown.myapplication.intakeListViewAdapter.db.deleteDailyList(((intakelistViewItem.getItemNumStr()) + ""));
    }else
        if ((intakelistViewItem.getItemNumStr()) < 1) {
        }else {
            org.androidtown.myapplication.intakeListViewAdapter.db.minusTimes(intakelistViewItem.getItemNameStr());
            intakelistViewItem.setItemNumStr(org.androidtown.myapplication.intakeListViewAdapter.db.getItemTimes(_foodName));
            intakeNumTxt.setText(((intakelistViewItem.getItemNumStr()) + ""));
        }
    
}