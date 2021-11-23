private void setCurrentRadioSelections() {
    int idOfCurrentSelection = -1;
    switch (mapType) {
        case com.google.android.gms.maps.GoogleMap.MAP_TYPE_NORMAL :
            idOfCurrentSelection = R.id.rbSettingsMapTypeNormal;
            break;
        case com.google.android.gms.maps.GoogleMap.MAP_TYPE_HYBRID :
            idOfCurrentSelection = R.id.rbSettingsMapTypeHybrid;
            break;
        case com.google.android.gms.maps.GoogleMap.MAP_TYPE_SATELLITE :
            idOfCurrentSelection = R.id.rbSettingsMapTypeSatellite;
            break;
        case com.google.android.gms.maps.GoogleMap.MAP_TYPE_TERRAIN :
            idOfCurrentSelection = R.id.rbSettingsMapTypeTerrain;
            break;
        default :
            break;
    }
    if (idOfCurrentSelection != (-1)) {
        rgSettingsMapType.check(idOfCurrentSelection);
    }
    if (isMetric) {
        rgSettingsMapUnit.check(R.id.rbSettingsMapUnitKilometers);
    }else {
        rgSettingsMapUnit.check(R.id.rbSettingsMapUnitMiles);
    }
}