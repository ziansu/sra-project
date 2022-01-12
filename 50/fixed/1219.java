public static void addToMap(int index1, int index2) {
    java.lang.String key = SimulationThread.mapIndecies(index1, index2);
    SimulationThread._collisionMap.put(key, true);
}