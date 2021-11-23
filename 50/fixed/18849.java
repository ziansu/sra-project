@java.lang.Override
public void onClick(android.view.View view) {
    net.kyouko.cloudier.CloudierApplication.getBus().post(new net.kyouko.cloudier.event.CommentTweetEvent(tweet, tweet.nickname, time.getText().toString(), content.getText().toString(), this));
}