@java.lang.Override
public void onFragmentGridInteraction(com.example.intervenant.myapplication.com.example.intervenant.core.Food food) {
    android.content.Intent detailIntent = new android.content.Intent(this, com.example.intervenant.myapplication.com.example.intervenant.core.DetailActivity.class);
    detailIntent.putExtra("name", food.name);
    detailIntent.putExtra("image", food.image);
    detailIntent.putExtra("info", food.info);
    detailIntent.putExtra("price", food.price);
    startActivity(detailIntent);
}