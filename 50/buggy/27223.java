@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            new android.support.v4.app.ListFragment();
        case 1 :
            new com.testproject.amit.snapchat_new.FriendsFragment();
    }
    return null;
}