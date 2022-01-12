@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.byteshaft.streamsound.fragments.PlayerListFragment();
        case 1 :
            return new com.byteshaft.streamsound.fragments.PlayerFragment();
        case 2 :
            return new com.byteshaft.streamsound.fragments.SocialMediaFragment();
        default :
            return new com.byteshaft.streamsound.fragments.SocialMediaFragment();
    }
}