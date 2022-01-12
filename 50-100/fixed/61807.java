@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    dbRef.child("users").child(user.getUid()).child("current_budget").setValue(i);
    if ((periodID) != null) {
        dbRef.child("periods").child(periodID).child("budgetGoal").child(currentTimestr).setValue(i);
    }
}