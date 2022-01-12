@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (dataSnapshot.hasChild(username)) {
        dataSnapshot = dataSnapshot.child(username);
        purdue.bowlingapp.User x = dataSnapshot.getValue(purdue.bowlingapp.User.class);
        if (password.equals(x.getPassword())) {
            java.lang.System.out.println(purdue.bowlingapp.MainActivity.welcome_message);
            login(username);
        }else {
            java.lang.System.out.println(purdue.bowlingapp.MainActivity.failure_message);
            loginFail();
        }
    }else {
        java.lang.System.out.println(purdue.bowlingapp.MainActivity.failure_message);
        loginFail();
    }
}