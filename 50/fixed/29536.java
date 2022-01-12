public static void getInfoForTourLocation(android.app.Activity activity, com.example.john.norfolktouring.TourLocation tourLocation) {
    java.util.List<com.example.john.norfolktouring.TourLocation> tourLocations = new java.util.ArrayList(java.util.Arrays.asList(tourLocation));
    com.example.john.norfolktouring.Utils.PlacesUtils.getInfoForTourLocations(activity, tourLocations);
}