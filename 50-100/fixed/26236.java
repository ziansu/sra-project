@java.lang.Override
public void onClick(android.view.View v) {
    android.os.Bundle userEventDetails = new android.os.Bundle();
    userEventDetails.putString("userEventDataJSON", userEventData.toString());
    android.content.Intent writeComment = new android.content.Intent(getApplicationContext(), com.waynehillsfbla.waynehillsnow.WriteCommentActivity.class);
    writeComment.putExtras(userEventDetails);
    startActivity(writeComment);
}