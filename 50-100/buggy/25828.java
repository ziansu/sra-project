@java.lang.Override
public com.epicodus.myrestaurants.adapters.RestaurantViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    mContext = parent.getContext();
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item_drag, parent, false);
    return new com.epicodus.myrestaurants.adapters.RestaurantViewHolder(view, getItems(), mRestaurantSelectedListener);
}