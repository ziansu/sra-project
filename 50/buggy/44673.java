@java.lang.Override
public int getCount() {
    int offset = 0;
    if ((me.ccrama.redditslide.SettingValues.single) || (me.ccrama.redditslide.SettingValues.swipeAnywhere)) {
        offset = 1;
    }
    return (subredditPosts.getPosts().size()) + offset;
}