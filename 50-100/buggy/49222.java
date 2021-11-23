public static double getDelay(int srcID, int destID) {
    if (org.cloudbus.cloudsim.NetworkTopology.networkEnabled) {
        try {
            double delay = org.cloudbus.cloudsim.NetworkTopology.delayMatrix.getDelay(org.cloudbus.cloudsim.NetworkTopology.map.get(srcID), org.cloudbus.cloudsim.NetworkTopology.map.get(destID));
            if (srcID != 13)
                org.cloudbus.cloudsim.edge.util.CustomLog.printf("%s\t\t%s\t\t%s\t\t\t%s", org.cloudbus.cloudsim.edge.util.TextUtil.toString(org.cloudbus.cloudsim.core.CloudSim.clock()), ((("#" + srcID) + "->#") + destID), "DELAY", delay);
            
            return delay;
        } catch (java.lang.Exception e) {
        }
    }
    return 0.0;
}