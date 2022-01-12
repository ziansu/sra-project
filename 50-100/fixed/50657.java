@java.lang.Override
public android.support.v4.app.Fragment getItem(int index) {
    android.support.v4.app.Fragment returnFrag = null;
    switch (index) {
        case 0 :
            returnFrag = com.justthetipband.christophertino.androidapp.WebsiteBlogPostsFragment.newInstance(index);
            break;
        case 1 :
            returnFrag = com.justthetipband.christophertino.androidapp.ScheduleFragment.newInstance(index);
            break;
        case 2 :
            returnFrag = com.justthetipband.christophertino.androidapp.YouTubeFragment.newInstance(index);
            break;
        case 3 :
            returnFrag = com.justthetipband.christophertino.androidapp.TwitterFragment.newInstance(index);
            break;
    }
    return returnFrag;
}