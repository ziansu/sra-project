public void goToMyBookingsFragment() {
    popEveryFragment();
    hideMapFragment();
    java.lang.String role = rolePreference.getCurrentRole();
    if (com.angular.gerardosuarez.carpoolingapp.utils.StringUtils.isEmpty(role)) {
        return ;
    }
    if (com.angular.gerardosuarez.carpoolingapp.navigation.NavigationManager.ROLE_DRIVER.equalsIgnoreCase(role)) {
        open(new com.angular.gerardosuarez.carpoolingapp.fragment.MyBookingDriverFragment(), MyBookingDriverFragment.TAG);
    }else {
        open(new com.angular.gerardosuarez.carpoolingapp.fragment.MyBookingPassengerFragment(), MyBookingPassengerFragment.TAG);
    }
}