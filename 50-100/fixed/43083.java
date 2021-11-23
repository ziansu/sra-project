@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot userSnapshot : dataSnapshot.getChildren()) {
        user = userSnapshot.getValue(com.hallak.billdozer.models.User.class);
    }
    if ((user) == null) {
        com.hallak.billdozer.models.User toSave = new com.hallak.billdozer.models.User(userId, userName, userEmail);
        com.hallak.billdozer.services.UserService.createUser(toSave);
        android.util.Log.d(TAG, "Saving user in Firebase");
    }else {
        android.util.Log.i(TAG, "Collected User ");
    }
}