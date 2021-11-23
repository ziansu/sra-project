public void itemsAdded(int pos, java.util.List dataList) {
    if ((googleMap) == null)
        updatePending = true;
    else {
        for (java.lang.Object item : dataList) {
            if (item instanceof com.kimeeo.kAndroid.map.IPOI)
                addPOIMarker(((com.kimeeo.kAndroid.map.IPOI) (item)));
            else {
                com.kimeeo.kAndroid.map.IPOI poi = getPOIForObject(item);
                if (poi != null)
                    addPOIMarker(poi);
                
            }
        }
        fitMapToPins();
    }
    if ((mProgressBar) != null)
        mProgressBar.setVisibility(View.GONE);
    
    firstItemIn = true;
}