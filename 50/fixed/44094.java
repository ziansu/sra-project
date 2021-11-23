@java.lang.Override
public void onChildChanged(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    changeNetworthList(dataSnapshot);
    calculateNetWorthChange();
    setNetWorth();
}