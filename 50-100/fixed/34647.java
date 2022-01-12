@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot d : dataSnapshot.getChildren()) {
        com.fivetrue.workout.timer.vo.UserInfo u = d.getValue(com.fivetrue.workout.timer.vo.UserInfo.class);
        if (userInfo.getUserId().equals(u.getUserId())) {
            if (com.fivetrue.workout.timer.LL.D)
                android.util.Log.d(com.fivetrue.workout.timer.firebase.user.FirebaseUser.TAG, ("onDataChange: found data : " + (mUserInfo)));
            
            d.getRef().setValue(userInfo);
            mUserInfo = userInfo;
            e.onNext(mUserInfo);
            e.onComplete();
        }
    }
}