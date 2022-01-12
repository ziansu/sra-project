@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (((dataSnapshot.getValue()) != null) && (dataSnapshot.getValue().equals(emailHash))) {
        android.util.Log.d("", java.lang.String.format("FirebaseBackend:connectBudgetAndUserByEmail: value: %s, address: %s", dataSnapshot.getValue(), emailHash));
        connectBudgetAndUser(bid, uidAsString, emailHash);
    }else {
        android.util.Log.d("", java.lang.String.format("FirebaseBackend:connectBudgetAndUserByEmail: uid is: %s, value: is null, address: %s", uidAsString, emailHash));
    }
}