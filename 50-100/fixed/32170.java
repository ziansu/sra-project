@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    mRouterMenu = menu.findItem(R.id.menu_router);
    if ((mNetworkStateInfo) != null) {
        if ((mNetworkStateInfo.getGatewayIpAddress()) != null) {
            mRouterMenu.setVisible(true);
        }else {
            mRouterMenu.setVisible(false);
        }
    }
    return super.onPrepareOptionsMenu(menu);
}