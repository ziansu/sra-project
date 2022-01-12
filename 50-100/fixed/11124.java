@java.lang.Override
public boolean onNavigationItemSelected(int position, long id) {
    if (com.antisocial.app.util.BlockUtils.isBlockServiceRunning(this, com.antisocial.app.service.CoreService.class)) {
        getActionBar().setSelectedNavigationItem(currentSelectedItem);
        if ((currentSelectedItem) != position) {
            alert = new android.app.AlertDialog.Builder(this).setTitle("Alert").setMessage("Block is running").setPositiveButton("OK", null).show();
        }
    }else {
        com.antisocial.app.util.BlockUtils.setCurrentMode(profileList[position]);
        currentSelectedItem = position;
    }
    return true;
}