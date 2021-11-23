@org.junit.Before
public void buildingSetup() {
    mList = new java.util.ArrayList<com.softwareengineeringapp.kamys.findmean.buildingObject>();
    mList.add(new com.softwareengineeringapp.kamys.findmean.buildingObject(true, true, (-89.4067), 43.0755, true, true, "Van Hise"));
    MapsActivity.buildings = mList;
}