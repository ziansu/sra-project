public void onClick(android.content.DialogInterface dialog, int id) {
    com.google.firebase.database.DatabaseReference ref = mDatabase.child((("/usersUid/" + (user.userUid)) + "/userInfo"));
    java.util.Map<java.lang.String, java.lang.Object> nickname = new java.util.HashMap<java.lang.String, java.lang.Object>();
    nickname.put("nickName", et.getText().toString());
    ref.updateChildren(nickname);
}