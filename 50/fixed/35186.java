public void goToMapFragment() {
    java.lang.String role = rolePreference.getCurrentRole();
    if (com.angular.gerardosuarez.carpoolingapp.utils.StringUtils.isEmpty(role)) {
        return ;
    }
    open(new com.angular.gerardosuarez.carpoolingapp.fragment.MyMapFragment(), MyMapFragment.TAG);
}