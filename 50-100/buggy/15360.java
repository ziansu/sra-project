@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            com.pommerening.quinn.foodtruck.fragment.tabs.employee.EmployeeItemsFragment invTab = com.pommerening.quinn.foodtruck.fragment.tabs.employee.EmployeeItemsFragment.newInstance(mUsername);
            return invTab;
        case 1 :
            com.pommerening.quinn.foodtruck.fragment.tabs.employee.EmployeeOrderFragment orderTab = new com.pommerening.quinn.foodtruck.fragment.tabs.employee.EmployeeOrderFragment();
            return orderTab;
        case 2 :
            com.pommerening.quinn.foodtruck.fragment.tabs.employee.EmployeeSettingsFragment setTab = com.pommerening.quinn.foodtruck.fragment.tabs.employee.EmployeeSettingsFragment.newInstance(mUsername);
            return setTab;
        case 3 :
            com.google.android.gms.maps.SupportMapFragment tabMap = com.pommerening.quinn.foodtruck.fragment.MiniMapFragment.newInstance();
            return tabMap;
        default :
            return null;
    }
}