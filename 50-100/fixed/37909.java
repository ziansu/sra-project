@java.lang.Override
public void onClick(android.view.View v) {
    int itemPosition = getLayoutPosition();
    android.content.Intent intent = new android.content.Intent(mContext, com.example.guest.myrestaurants.ui.RestaurantDetailActivity.class);
    intent.putExtra("position", (itemPosition + ""));
    intent.putExtra("restaurants", org.parceler.Parcels.wrap(mRestaurants));
    mContext.startActivity(intent);
}