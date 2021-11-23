@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.example.ak.firebaseauthdemo.UserInformation user = dataSnapshot.getValue(com.example.ak.firebaseauthdemo.UserInformation.class);
    if (user != null) {
        if ((user.getName()) != "default") {
            java.lang.String string = (("Name: " + (user.getName())) + " Age: ") + (user.getAge());
            setImage(user);
            textView.setText(string);
        }else {
        }
    }
}