@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString(com.huhx0015.doordashchallenge.view.fragments.RestaurantListFragment.INSTANCE_TAG, mTag);
    if ((mRestaurantList) != null) {
        outState.putParcelableArrayList(com.huhx0015.doordashchallenge.view.fragments.RestaurantListFragment.INSTANCE_RESTAURANT_LIST, new java.util.ArrayList(mRestaurantList));
    }
}