public void searchParking(java.lang.String searchParameter) {
    for (com.example.parkingApp.parkme.model.Parking p : parkings) {
        if (!(p.getParkingName().toLowerCase().contains(searchParameter.toLowerCase()))) {
            for (com.google.android.gms.maps.model.Marker mar : markerList) {
                if (mar.getTitle().equals(p.getParkingName())) {
                    mar.setVisible(false);
                }
            }
        }
    }
}