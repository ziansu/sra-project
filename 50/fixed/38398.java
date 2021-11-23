@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.amazingcoders_android.activities.VenuePageActivity.class);
    intent.putExtra("id", venue.id);
    startActivity(intent);
}