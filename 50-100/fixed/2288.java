@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("click listener", "working!");
    int itemPosition = getLayoutPosition();
    android.content.Intent intent = new android.content.Intent(mContext, com.epicodus.myrestaurants.ui.RestaurantDetailActivity.class);
    intent.putExtra("position", itemPosition);
    intent.putExtra("restaurants", org.parceler.Parcels.wrap(mRestaurants));
    mContext.startActivity(intent);
}