@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.mzwee.randrestaurant.YelpQuery.class);
    intent.putExtra("category", "mediterranean");
    startActivity(intent);
}