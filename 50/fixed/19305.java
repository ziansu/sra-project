private void sendRestaurant(com.cse5306.wemeet.objects.Restaurant restaurant, java.lang.String group_id) {
    chooseRestaurantTask = new com.cse5306.wemeet.tasks.ChooseRestaurantTask(userPreferences.getSessionUserPrefUsername(), group_id, restaurant.getLocId());
    chooseRestaurantTask.response = this;
    chooseRestaurantTask.execute();
}