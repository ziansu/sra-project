@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    dbRef.child("users").child(user.getUid()).child("current_budget").setValue(java.lang.Double.parseDouble(changedGoal.substring(1)));
    dbRef.child("periods").child(periodID).child("budgetGoal").child(currentTimestr).setValue(java.lang.Double.parseDouble(changedGoal.substring(1)));
}