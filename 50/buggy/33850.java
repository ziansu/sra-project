public static void fixIC2Loading() {
    if (omtteam.omlib.compatability.ModCompatibility.IC2Loaded) {
        try {
            java.lang.Class.forName("ic2.api.energy.tile.IEnergySink", false, java.lang.ClassLoader.getSystemClassLoader());
        } catch (java.lang.ClassNotFoundException e) {
            omtteam.omlib.compatability.ModCompatibility.IC2Loaded = false;
        }
    }
}