@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    uk.ac.tees.donut.squad.users.FBUser user = dataSnapshot.getValue(uk.ac.tees.donut.squad.users.FBUser.class);
    user.setPicture(photoUrl.toString());
    user.setName(name);
    mDatabase.child(uId).setValue(user);
}