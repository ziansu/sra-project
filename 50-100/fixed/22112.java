public void addAll(java.util.List<com.ram.capstone.capstone_project.models.RestaurantContainer> moreRestaurantContainers) {
    if ((restaurantContainers) != null) {
        if ((((restaurantContainers.size()) <= 0) && (com.ram.capstone.capstone_project.utils.CommonUtils.getBooleanFromSharedPreference(mContext, SharedPref.TWO_PANE_MODE))) && ((moreRestaurantContainers.size()) > 0))
            updateRestaurantDetail(moreRestaurantContainers.get(0).getRestaurant());
        
        restaurantContainers.addAll(moreRestaurantContainers);
        notifyDataSetChanged();
    }
}