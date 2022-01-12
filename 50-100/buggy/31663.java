public static double calcCost(java.util.LinkedList<de.westnordost.osmapi.map.data.LatLon> nodes, de.westnordost.osmapi.map.data.Way way) {
    double distance = 0.0;
    for (int i = 0; i < ((nodes.size()) - 1); i++) {
        if (nodes.iterator().hasNext()) {
            distance += de.spinosm.common.Common.calcDistance(nodes.get(i), nodes.get((i + 1)));
        }
    }
    return distance / (de.spinosm.common.Common.getSpeedLimits(way, Vehicle.CAR));
}