@java.lang.Override
public boolean onLongClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.android.rowanparkingpass.Activities.CreateDriverActivity.class);
    intent.putExtra(com.example.android.rowanparkingpass.Activities.MODE, mode.UPDATE_PASS_DRIVER.name());
    intent.putExtra("Driver", ((java.io.Serializable) (driver)));
    intent.putExtra("Vehicle", ((java.io.Serializable) (vehicle)));
    startActivity(intent);
    finish();
    return true;
}