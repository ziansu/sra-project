@java.lang.Override
public void onDistanceFabClick() {
    if (checkLocationOn()) {
        homeFragment.setLocation(getLocation());
    }
}