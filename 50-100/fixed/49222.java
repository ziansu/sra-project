public static double getDelay(int srcID, int destID) {
    if (org.cloudbus.cloudsim.NetworkTopology.networkEnabled) {
        try {
            double delay = org.cloudbus.cloudsim.NetworkTopology.delayMatrix.getDelay(org.cloudbus.cloudsim.NetworkTopology.map.get(srcID), org.cloudbus.cloudsim.NetworkTopology.map.get(destID));
            if (srcID != 13)
                return delay;
            
        } catch (java.lang.Exception e) {
        }
    }
    return 0.0;
}