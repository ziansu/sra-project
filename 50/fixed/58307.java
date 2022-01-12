public void setRegionValues(java.util.ArrayList<com.pbm.Region> regions) {
    regionValues = regions;
    if ((adapter) != null) {
        adapter.clear();
        adapter.addAll(regionValues);
        updateLocation();
    }
}