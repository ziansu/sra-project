@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.example.guest.myrestaurants.adapters.RestaurantListAdapter.TAG, "click test");
    int itemPosition = getLayoutPosition();
    android.content.Intent intent = new android.content.Intent(mContext, com.example.guest.myrestaurants.ui.RestaurantDetailActivity.class);
    intent.putExtra("position", (itemPosition + ""));
    intent.putExtra("restaurants", org.parceler.Parcels.wrap(mRestaurants));
    mContext.startActivity(intent);
}