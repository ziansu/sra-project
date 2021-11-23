public static void buildArray() {
    char boatType;
    for (int x = 0; x < (DebugEleven4.boatArray.length); ++x) {
        boatType = DebugEleven4.getBoat();
        if (boatType == 'r')
            DebugEleven4.boatArray[x] = new DebugRowboat();
        else
            DebugEleven4.boatArray[x] = new DebugOceanLiner();
        
    }
}