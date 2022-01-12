@java.lang.Override
public android.support.v4.app.Fragment getItem(int index) {
    switch (index) {
        case 0 :
            return com.miz.mizuu.fragments.ActorBiographyFragment.newInstance(json, mActorThumb);
        case 1 :
            return com.miz.mizuu.fragments.ActorMoviesFragment.newInstance(json, baseUrl);
        case 2 :
            return com.miz.mizuu.fragments.ActorPhotosFragment.newInstance(json, actorName, baseUrl);
        default :
            return null;
    }
}