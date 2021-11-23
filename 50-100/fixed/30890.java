@java.lang.Override
public void onClick(android.view.View view) {
    if (hasSourceTweet) {
        net.kyouko.cloudier.CloudierApplication.getBus().post(new net.kyouko.cloudier.event.RetweetTweetEvent(tweet, sourceContent.getText().toString(), this, context.getString(R.string.text_pattern_comment, tweet.username, tweet.originalContent), false));
    }else {
        net.kyouko.cloudier.CloudierApplication.getBus().post(new net.kyouko.cloudier.event.RetweetTweetEvent(tweet, content.getText().toString(), this));
    }
}