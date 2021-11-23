@java.lang.Override
public void onClick(android.view.View view) {
    switch (composerType) {
        case net.kyouko.cloudier.ui.activity.ComposerActivity.TYPE_NEW :
        default :
            sendTweet();
        case net.kyouko.cloudier.ui.activity.ComposerActivity.TYPE_COMMENT :
            comment();
        case net.kyouko.cloudier.ui.activity.ComposerActivity.TYPE_RETWEET :
            retweet();
    }
}