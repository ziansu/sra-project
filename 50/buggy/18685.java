@java.lang.Override
public void run() {
    getTweetsTimeline(mUser.id, ((com.mintminter.simpletwitter.common.Util.PROFILETIMELINECOUNT) * 2), 0, mPreviousLastTweet.id);
}