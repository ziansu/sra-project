@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot snapshot : dataSnapshot.getChildren()) {
        restaurants.add(snapshot.getValue(com.epicodus.myrestaurants.models.Restaurant.class));
    }
    int itemPosition = getLayoutPosition();
    android.content.Intent intent = new android.content.Intent(mContext, com.epicodus.myrestaurants.ui.RestaurantDetailActivity.class);
    intent.putExtra("position", itemPosition);
    intent.putExtra("restaurants", org.parceler.Parcels.wrap(restaurants));
    mContext.startActivity(intent);
}