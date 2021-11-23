protected android.graphics.Path saveDoInBackground(java.lang.Void... v) {
    com.graphhopper.GraphHopper tmpHopp = new com.graphhopper.GraphHopper().forMobile();
    com.graphhopper.routing.util.FlagEncoder encoder = null;
    hopper = tmpHopp;
    hopper.setOSMFile(((((ghFolder) + "/") + (currentArea)) + ".pbf"));
    hopper.setEncodingManager(new com.graphhopper.routing.util.EncodingManager("FOOT,BIKE,CAR"));
    hopper.setCHWeighting("fastest");
    hopper.importOrLoad();
    return null;
}