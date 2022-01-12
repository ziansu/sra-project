@java.lang.Override
public boolean onPrepareOptionsMenu(final android.view.Menu menu) {
    android.view.MenuItem vpnMenuItem = menu.findItem(R.id.action_vpn_control);
    if (vpnMenuItem != null) {
        if (org.getlantern.lantern.vpn.Service.isRunning(getApplicationContext())) {
            vpnMenuItem.setTitle(R.string.action_disable_vpn);
        }else {
            vpnMenuItem.setTitle(R.string.action_enable_vpn);
        }
    }
    return super.onPrepareOptionsMenu(menu);
}