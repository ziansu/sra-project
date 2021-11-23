@java.lang.Override
public void onProgressChange(android.location.Location location, com.mapbox.services.android.navigation.v5.RouteProgress routeProgress) {
    if ((routeProgress.getAlertUserLevel()) == (NavigationConstants.ARRIVE_ALERT_LEVEL)) {
        java.lang.System.out.println("working");
        endNavigation();
    }
}