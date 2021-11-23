@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    uk.ac.tees.donut.squad.users.FBUser user = dataSnapshot.getValue(uk.ac.tees.donut.squad.users.FBUser.class);
    if (user == null) {
        user = new uk.ac.tees.donut.squad.users.FBUser();
    }
    if (photoUrl != null) {
        user.setPicture(photoUrl.toString());
    }
    if (name != null) {
        user.setName(name);
    }
    mDatabase.child(uId).setValue(user);
}