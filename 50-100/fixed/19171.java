@java.lang.Override
public void onClick(android.view.View v) {
    mPosition = getLayoutPosition();
    mRestaurantSelectedListener.onRestaurantSelected(mPosition, mRestaurants);
    if ((mOrientation) == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
        createDetailFragment(mPosition);
    }else {
        android.content.Intent intent = new android.content.Intent(mContext, com.epicodus.myrestaurants.ui.RestaurantDetailActivity.class);
        intent.putExtra(Constants.EXTRA_KEY_POSITION, mPosition);
        intent.putExtra(Constants.EXTRA_KEY_RESTAURANTS, org.parceler.Parcels.wrap(mRestaurants));
        mContext.startActivity(intent);
    }
}