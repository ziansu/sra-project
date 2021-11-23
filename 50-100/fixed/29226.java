public static boolean checkCollision(int index1, int index2) {
    java.lang.String check = SimulationThread.mapIndecies(index1, index2);
    if (SimulationThread._collisionMap.containsKey(check)) {
        SimulationThread._collisionMap.remove(check);
        return true;
    }else
        return false;
    
}