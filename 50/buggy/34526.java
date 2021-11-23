@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new com.busao.gyn.stops.list.StopListFragment();
        case 1 :
            return com.busao.gyn.stops.map.BusaoMapFragment.newInstance();
    }
    return null;
}