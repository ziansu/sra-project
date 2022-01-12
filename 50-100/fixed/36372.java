@java.lang.Override
public void onClick(android.view.View view) {
    registerdUser = userName.getText().toString();
    if (android.text.TextUtils.isEmpty(registerdUser)) {
        userName.setError("Please enter a user name!!");
        return ;
    }else {
        setSession.storeUserName(registerdUser);
        android.content.Intent i = new android.content.Intent(getApplicationContext(), com.humalabs.chatnep.activity.ChatActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
}