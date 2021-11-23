@java.lang.Override
public boolean onBackPressed(com.intervalintl.router.LinkRouterAccessor currentRouterAccessor) {
    java.lang.String topPath = currentRouterAccessor.getCurrentLink().getPath();
    android.util.Log.d("Pablo", ("On Back Pressed with current Route: " + topPath));
    if (drawerOpenState) {
        toggleDrawer();
        return true;
    }
    if (topPath.equals(RouteRegistry.Screen1.getLink().getPath())) {
        com.intervalintl.router.Router.destroy();
        return false;
    }else {
        navigateToPosition(0);
        return true;
    }
}