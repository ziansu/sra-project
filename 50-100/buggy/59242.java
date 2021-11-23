public void onClick(android.content.DialogInterface dialog, int id) {
    android.util.Log.d("On click", et.getText().toString());
    com.google.firebase.database.DatabaseReference ref = mDatabase.child((("/usersUid/" + (user.userUid)) + "/userInfo"));
    java.util.Map<java.lang.String, java.lang.Object> nickname = new java.util.HashMap<java.lang.String, java.lang.Object>();
    nickname.put("nickName", et.getText().toString());
    ref.updateChildren(nickname);
}