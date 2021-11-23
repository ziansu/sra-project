@java.lang.Override
public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        if (systems.eddon.android.zoo_keeper.ZooGate.myActivity.getLocalClassName().matches("Notify")) {
            systems.eddon.android.zoo_keeper.ZooGate z = ((systems.eddon.android.zoo_keeper.ZooGate) (systems.eddon.android.zoo_keeper.ZooGate.myActivity));
            z.onNavigationDrawerItemSelected(0);
            return true;
        }else {
            return false;
        }
    }
    return false;
}