public void setRegionValues(java.util.ArrayList<com.pbm.Region> regions) {
    regionValues = regions;
    adapter.clear();
    adapter.addAll(regionValues);
    updateLocation();
}