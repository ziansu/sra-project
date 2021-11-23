private void setupRegionalization() {
    com.remulasce.lametroapp.java_core.RegionalizationHelper.getInstance().agencyName = "lametro";
    java.util.Collection<com.remulasce.lametroapp.java_core.basic_types.Agency> agencies = new java.util.ArrayList<com.remulasce.lametroapp.java_core.basic_types.Agency>();
    agencies.add(new com.remulasce.lametroapp.java_core.basic_types.Agency("lametro-rail"));
    agencies.add(new com.remulasce.lametroapp.java_core.basic_types.Agency("lametro"));
    com.remulasce.lametroapp.java_core.RegionalizationHelper.getInstance().setActiveAgencies(agencies);
}