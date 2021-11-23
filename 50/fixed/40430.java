public void onClick(android.view.View v) {
    inOutFilter = "outdoor";
    mapboxMap.clear();
    setMarkers(mapboxMap, gml);
    if (filter_autoclose)
        FAM_InOut.close(filter_autoclose);
    
}