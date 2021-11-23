private void populateParkingData(int vehicle) {
    java.util.ArrayList<waterloo.com.core.LocationData> temp = getResponsefromServer(vehicle);
    refineLocationData(temp);
}