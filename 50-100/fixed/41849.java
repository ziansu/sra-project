@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.google.firebase.database.GenericTypeIndicator<com.example.recleague.userProfile> t = new com.google.firebase.database.GenericTypeIndicator<com.example.recleague.userProfile>() {    };
    com.example.recleague.userProfile tmp = dataSnapshot.getValue(t);
    if (tmp == null) {
        newUser(user2);
    }else {
        curUser = tmp;
    }
    android.widget.TextView tv = ((android.widget.TextView) (findViewById(R.id.tv_intro)));
    java.lang.String intrmessage = "hello ";
    intrmessage += curUser.getNickname();
    intrmessage += " welcome to RecLeague";
    tv.setText(intrmessage);
}