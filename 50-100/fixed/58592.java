@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (com.carcalendar.dmdev.carcalendar.GarageActivity.VEHICLE_ADDED_SUCCESSFULLY)) {
        android.widget.Toast.makeText(this, "Vehicle added successfully !!!", Toast.LENGTH_SHORT).show();
        vAdapter.updateVehicleList();
    }else {
        android.widget.Toast.makeText(this, "Something went wrong !!!", Toast.LENGTH_SHORT).show();
    }
}