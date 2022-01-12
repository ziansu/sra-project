@java.lang.Override
public void onClick(android.view.View view) {
    if ((view.getId()) == (R.id.contentPanel)) {
        if (this.contextMenuOn) {
            selectedSwitch.setTextColor(Color.BLACK);
            setContextMenuOn(false, null);
            invalidateOptionsMenu();
        }
    }else {
        if (view.getTag().equals(com.team3.pem.pem.activities.MainActivity.TAG_NEW_EVENT)) {
            showRateDay();
        }
        if (view.getTag().equals(com.team3.pem.pem.activities.MainActivity.TAG_NEW_FACTOR)) {
            showNewFactorDialog();
        }
    }
}