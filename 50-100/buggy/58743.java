@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    userData = dataSnapshot.getValue(sjohns70.motive8.UserData.class);
    points = userData.getPoints_earned();
    tv_points.setText(("" + (points)));
    logo.setText(("" + (points)));
    myRef.child("points_earned").setValue(points);
    _count = userData.getCount_remainder();
}