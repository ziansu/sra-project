@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getBaseContext(), com.example.rounaksalim95.transit_hub.Parking_Space_Activity.class);
    intent.putExtra("data", data.toString());
    intent.putExtra("garageName", view.getTag().toString());
    intent.putExtra("floorName", view.getId());
    startActivity(intent);
}