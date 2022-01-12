@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent sendIntent = new android.content.Intent();
    sendIntent.setAction(Intent.ACTION_SEND);
    java.lang.String sendStr = (((((mUserName.getText()) + " says '") + (mReview.getComment())) + "' ") + (emojiStr)) + ".";
    sendIntent.putExtra(Intent.EXTRA_TEXT, sendStr);
    sendIntent.setType("text/plain");
    view.getContext().startActivity(android.content.Intent.createChooser(sendIntent, "Send review to..."));
}