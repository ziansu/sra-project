@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    super.onCreateOptionsMenu(menu);
    getMenuInflater().inflate(R.menu.menu_map, menu);
    android.view.MenuItem changModeItem = menu.findItem(R.id.change_transit_mode_item);
    mDrivingMode = !(mDrivingMode);
    java.lang.String driveMode = (mDrivingMode) ? com.huynhtinh.android.nekofee.controler.activity.MapActivity.DRIVING_MODE : com.huynhtinh.android.nekofee.controler.activity.MapActivity.WALKING_MODE;
    changModeItem.setTitle(getResources().getString(R.string.change_mode, driveMode));
    return true;
}