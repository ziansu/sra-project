private java.lang.String getPoliceStation(int num_jurisdiction) throws org.json.JSONException {
    java.lang.String station_name = null;
    for (int i = 0; i < (policeStations.size()); i++) {
        if ((policeStations.get(i).getJurisdiction()) == num_jurisdiction) {
            station_name = policeStations.get(i).getName();
            break;
        }
    }
    return station_name;
}