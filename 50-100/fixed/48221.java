@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.gmail.dleemcewen.tandemfieri.CartActivity.class);
    intent.putExtra("cart", order);
    intent.putExtra("restaurantId", restaurant.getId());
    intent.putExtra("ownerId", restaurant.getOwnerId());
    intent.putExtra("deliveryCharge", restaurant.getCharge());
    intent.putExtra("restaurantName", restaurant.getName());
    startActivity(intent);
}