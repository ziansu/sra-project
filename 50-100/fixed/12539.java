public void bindRestaurant(com.example.bubbles.myrestaurants.models.Restaurant restaurant) {
    com.squareup.picasso.Picasso.with(mContext).load(restaurant.getImageUrl()).into(mRestaurantImageView);
    mNameTextView.setText(restaurant.getName());
    mCategoryTextView.setText(restaurant.getCategories().get(0));
    mRatingTextView.setText((("Rating: " + (restaurant.getRating())) + "/5"));
}