@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment fragment;
    switch (position) {
        case 0 :
            mCurrentDetailsFragment = new rayacevedo45.c4q.nyc.accessfoodnyc.DetailsFragment();
            return mCurrentDetailsFragment;
        case 1 :
            return new rayacevedo45.c4q.nyc.accessfoodnyc.MenuFragment();
        case 2 :
            fragment = new rayacevedo45.c4q.nyc.accessfoodnyc.ReviewsFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(Constants.EXTRA_KEY_VENDOR_OBJECT_ID, objectId);
            fragment.setArguments(bundle);
            return new rayacevedo45.c4q.nyc.accessfoodnyc.ReviewsFragment();
    }
    return null;
}