@java.lang.Override
public void handle(com.codepath.the_town_kitchen.models.User user) {
    com.codepath.the_town_kitchen.TheTownKitchenApplication.getCurrentUser().setUser(user);
    android.content.Intent intent = new android.content.Intent(this, com.codepath.the_town_kitchen.activities.MealListActivity.class);
    startActivity(intent);
}