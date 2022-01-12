@java.lang.Override
public void onClick(android.view.View v) {
    sendStopTalkingMessage();
    sendCancelRoutineMessage();
    android.content.Intent intent = new android.content.Intent(this, com.sxnwlfkk.dailyroutines.views.profileActivity.ProfileActivity.class);
    intent.setData(mCurrentUri);
    startActivity(intent);
    finish();
}