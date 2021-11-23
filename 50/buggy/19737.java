@java.lang.Override
public void find(java.lang.String bus_selection) {
    selectedBus = bus_selection;
    mapFrag = getMapFragment(false);
    getFragmentManager().beginTransaction().replace(R.id.container, mapFrag).commit();
}