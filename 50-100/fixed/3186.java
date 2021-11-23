@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    mUser = dataSnapshot.getValue(com.compscieddy.meetinthemiddle.model.User.class);
    if ((mUser) == null) {
        com.compscieddy.meetinthemiddle.BaseActivity.lawg.d("Safety Check: mUser is null so creating a user");
        com.compscieddy.meetinthemiddle.model.User.createUser(mFirebaseDatabase, user);
    }else {
        com.compscieddy.meetinthemiddle.BaseActivity.lawg.d(((("mUser obtained email: " + (mUser.email)) + " name: ") + (mUser.name)));
        userIsReady();
    }
}