@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot snapshot) {
    for (com.google.firebase.database.DataSnapshot postSnapshot : snapshot.getChildren()) {
        edu.gatech.group16.watersourcingproject.model.User temp = postSnapshot.getValue(edu.gatech.group16.watersourcingproject.model.User.class);
        if (temp.getEmail().equals(tempEmail)) {
            java.lang.String count = dbRef.getKey();
            home_activity.putExtra("USER", temp);
            startActivity(home_activity);
            finish();
        }
    }
}