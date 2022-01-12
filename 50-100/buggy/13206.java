java.lang.String getAddress(java.lang.String urlJson) {
    java.lang.String address = "";
    try {
        address = new com.example.geoapp.geoapp.MapsActivity.GetAddress(null).execute(urlJson).get();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
    return address;
}