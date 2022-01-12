@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new android.support.v4.app.ListFragment();
        case 1 :
            return new com.testproject.amit.snapchat_new.FriendsFragment();
    }
    return null;
}