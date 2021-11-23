@java.lang.Override
public void run() {
    if (((mUser) != null) && ((mPreviousLastTweet) != null)) {
        getTweetsTimeline(mUser.id, Util.PROFILETIMELINECOUNT, 0, mPreviousLastTweet.id);
    }
}