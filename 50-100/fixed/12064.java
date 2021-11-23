@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String nickName;
    Nick.setHint("");
    if (!((nickName = Nick.getText().toString()).equals(""))) {
        android.content.Intent GoToChat = new android.content.Intent(this, com.example.omri.ochat.ChatActivity.class);
        GoToChat.putExtra("nickname", nickName);
        startActivity(GoToChat);
    }else {
        android.util.Log.v("Debug", "Nickname missing");
        Nick.setHint("This field is mandatory");
        Nick.setHintTextColor(Color.RED);
    }
}