@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_restaurants);
    butterknife.ButterKnife.bind(this);
    android.util.Log.d(com.epicodus.myrestaurants.ui.RestaurantsActivity.TAG, "In RestaurantsActivity");
    android.content.Intent intent = getIntent();
    java.lang.String location = intent.getStringExtra("location");
    getRestaurants(location);
    mLocationTextView.setText(("Here are all the restaurants near: " + location));
}