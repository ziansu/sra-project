public void buildingSelected(java.lang.String name, com.google.android.gms.maps.model.LatLng point) {
    slidingUpPanel.setVisibility(View.VISIBLE);
    slidingUpText.setText(name);
    slidingUpPanel.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
    pathProvider = new uwp.cs.edu.parkingtracker.navigation.NavigationPathProvider();
    np = new uwp.cs.edu.parkingtracker.navigation.NodeParser(passedActivity);
    new uwp.cs.edu.parkingtracker.mapping.MapTransform.ListTask().execute(point);
}